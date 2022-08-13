import axios from "axios";
axios.defaults.baseURL = "/api"
const http = axios.create({
    baseURL:'',
    timeout: 1000*10
})
http.interceptors.request.use(
    config => {
        return config
    },
    err => {
        return Promise.reject(err)
    }
)

http.interceptors.response.use(
    res => {
        return res.data
    },
    error => {
        return Promise.reject(error)
    }
)

export default http