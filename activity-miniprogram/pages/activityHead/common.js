//活动详情时间格式转换
export const timestampToDate = (timestamp, type,symbol) => {
  // type 1 返回全部，type 2 同年不展示 type 3 自定义
  let date = new Date(timestamp); //年
  let Y = date.getFullYear(); //月
  let M = date.getMonth() + 1; //日
  let D = date.getDate(); //时
  let h = date.getHours(); //分
  let m = date.getMinutes();
  // M = M < 10 ? "0" + M : M;
  // D = D < 10 ? "0" + D : D;
  h = h < 10 ? "0" + h : h;
  m = m < 10 ? "0" + m : m;
  let currentDate = new Date();
  if (type == 2) {
    if (Y === currentDate.getFullYear()) {
      return `${M}月${D}日 ${h}:${m}`;
    } else {
      return `${Y}年${M}月${D}日 ${h}:${m}`;
    }
  } else if(type == 3) {
    if (Y === currentDate.getFullYear()) {
        return `${M}${symbol}${D} ${h}:${m}`;
    } else {
        return `${Y}${symbol}${M}${symbol}${D} ${h}:${m}`;
    }
  } else {
    return `${Y}年${M}月${D}日 ${h}:${m}`;
  }
};
