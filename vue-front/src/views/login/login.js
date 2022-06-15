import axios from "axios"

export async function generateToken() {
    const refreshToken = localStorage.getItem("refresh-token");
    axios.post('/refreshToken', {"body":""}, {headers: {
        'Content-Type':'application/json',
        'refreshToken': refreshToken
    }}).then(res => {
        console.log(res)
    })
}