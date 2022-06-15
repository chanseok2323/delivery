import Vue from 'vue'
import Router from 'vue-router'
import LoginForm from '@/views/login/LoginForm'
import Home from '@/views/Home'
import VueRouter from 'vue-router'
import {generateToken} from '@/views/login/login'

Vue.use(Router)

const router = new VueRouter({
    mode: "history",
    routes: [
      {
        path: "/",
        name: 'home',
        component: Home,
        meta: {unauthorized: true}
      },
      { path: "/loginForm", 
        name: 'loginForm', 
        component: LoginForm,
        meta: {unauthorized : true}    
      }
    ],
    linkActiveClass: "active",
    linkExactActiveClass: "exact-active",
});

router.beforeEach( async(to, from, next) => {
  if(localStorage.getItem("access-token") === null && localStorage.getItem("refresh-token") !== null) {
    // 토큰 재발급 함수 실행!
    
    console.log("토큰 재발급 함수 실행");
    await generateToken();
    
    return next();
  }
  if(to.matched.some(record => record.meta.unauthorized) || localStorage.getItem("access-token")) {
    console.log("정상 실행");
    return next();
  }

  console.log("로그인 필요");
  next("/loginForm");
})

export default router;
/*
export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    }
  ]
})
*/
