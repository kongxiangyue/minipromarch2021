import Vue from 'vue'
export default {
	login(userName,passWord,callback){
		if(userName != null && passWord != null && userName != '' && passWord!= '' ){
			uni.request({
				url: Vue.prototype.server_url + '/user/commonUser/wx/login',
				method: 'post',
				data: {
					userName: userName,
					passWord: passWord,
				},
				header: {
					'content-type': 'application/x-www-form-urlencoded' // 默认值
				},
				success(res) {
					if(res.data.code == 500){
						callback(false,res);
						return
					}
					if(callback != null){
						callback(true,res);
					}
					uni.setStorageSync('token', res.data.token);
					uni.setStorageSync('userid', res.data.data.id);
					uni.setStorageSync('expireTime', res.data.expire);
					
					uni.setStorageSync('userName', userName);
					uni.setStorageSync('passWord', passWord);
					
				}
			});
		}else{
			if(callback != null){
				callback(false,null);
			}
			uni.setStorageSync('token', null);
			uni.setStorageSync('userid', null);
			uni.setStorageSync('expireTime', null);	
		}
	}
}