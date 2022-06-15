<template>
  <header>
    <header>
		<h1><a href="#" class="logo"><img alt="Vue logo" src="../../assets/logo.png" width="80"></a></h1>
		<div class="menuWrap">
			<ul class="menu">
				<li><a href="javascript:;">메뉴1</a></li>
				<li><a :href="url">메뉴3</a></li>
        <router-link to="/loginForm">로그인</router-link>
			</ul>
		</div>
	</header>
  </header>
  
</template>

<script>
export default {
    name: 'header',
    methods: {
        fnLoginForm() {
            this.$router.push({
                name: "loginForm"
            });
        }
    }
}
</script>

<style scoped>
header{width:100%; text-align:center; position:relative; height:120px; border-bottom:1px solid #35495e}
header h1{position:absolute; top:0; left:100px;}
header ul.menu:after{display:block; clear:both; content:'';}
header ul.menu{position:absolute; top:20px; right:50px;}
header ul.menu li{float:left; padding:10px 20px; list-style:none;}

a{text-decoration:none; color:#333;}
</style>