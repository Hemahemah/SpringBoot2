<template>
  <div id="app">
    <el-header :gutter="40"><el-row :gutter="20">
      <el-col :offset="9">
        <div><h1>USER TABLE</h1></div>
      </el-col>
    </el-row></el-header>
    <el-main>
      <el-row :gutter="40">
        <el-col :span="12" :offset="5">
          <div><UserTable :tableData="tableData.records"></UserTable></div>
        </el-col>
      </el-row>
    </el-main>
    <el-footer :gutter="40">
      <el-row  :gutter="40">
        <el-col :span="10" :offset="7">
         <div><PageInfo :page="tableData" @getEmps="getEmps"></PageInfo>
         </div>
        </el-col>
      </el-row>
    </el-footer>


  </div>
</template>

<script>
import UserTable from "./components/UserTable";
import PageInfo from "./components/PageInfo";
import axios from "./utils/axios";
export default {
  name: 'App',
  data(){
    return {
      tableData :{}
    }
  },
  components: {
    PageInfo,
    UserTable,
  },
  methods:{
    /**
     * 获取用户数据
     * @param page 页码
     */
    getEmps(page){
      axios.get(`/api/emp/getEmps/${page}`).then(
          res => {
            this.tableData = res
          },
          err => {
            this.$message({
              type:'error',
              message:'请求发生错误'
            })
          }
      )
    }
  },
  mounted() {
    this.getEmps(1)
  }
}
</script>

<style>
</style>
