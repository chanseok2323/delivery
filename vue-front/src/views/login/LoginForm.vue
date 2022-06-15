<template>
    <form>
        <div class="container">
            <div class="form-group">
                <label>이메일</label>
                <input type="email" class="form-control" v-model="email">
            </div>
            <div class="form-group">
                <label>비밀번호</label>
                <input type="password" class="form-control" v-model="password">
            </div>
            <b-button variant="primary" @click='fetchData()'>로그인</b-button>
        </div>
    </form>
</template>

<script>
export default {
    name: 'loginForm',
    data() {
        return {

        }                 
    },
    methods: {
        fetchData() {
            const form = new FormData();
            form.append('email', this.email);
            form.append('password', this.password);

            this.$http.post('/login', form)
            .then(res => {
                console.log(res.data);
            })
            .catch(function(error) {
                console.log(error)
            });
        }
    },
    created() {
        //this.fetchData();
    }
}
</script>

<style>

</style>