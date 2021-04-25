<template>
	<view>
		<web-view :webview-styles="webviewStyles" :src="url"></web-view>
	</view>
</template>

<script>
export default {
	data() {
		return {
			url:'',
			webviewStyles: {
				progress: {
					color: '#FF3333'
				}
			},
		};
	},
	onLoad(option) {
		console.log(option.link);
		this.url = option.link
	}
};
</script>

<style></style>
