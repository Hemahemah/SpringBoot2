<template slot-scope="scope">
  <el-table :data="tableData"
            stripe
            height="390"
            style="width: 100%"
            class="user_table">
          <el-table-column
              prop="id"
              label="编号"
              width="100">
          </el-table-column>
          <el-table-column
              prop="lastName"
              label="姓名"
              width="180">
          </el-table-column>
          <el-table-column
              prop="email"
              label="邮箱">
          </el-table-column>
          <el-table-column
              prop="gender"
              label="性别">
          </el-table-column>
          <el-table-column
              fixed="right"
              label="操作"
              width="100">
            <el-button type="danger" icon="el-icon-delete" circle @click="deleteEmp"></el-button>
          </el-table-column>
        </el-table>
</template>

<script>

export default {
  name: "UserTable",
  props:['tableData'],
  data(){
    return{
    }
  },
  methods:{
    deleteEmp(){
     this.$confirm('此操作将用就删除这位员工，是否继续？','提示',{
       confirmButtonText: '确定',
       cancelButtonText: '取消',
       showCancelButton: true,
       type:'warning',
     }).then(() => {
       console.log(111)
       this.$message({
         type: 'success',
         message: '删除成功!',
       });
     }).catch(() => {
       this.$message({
         type: 'info',
         message: '已取消删除'
       });
     });
    }
  }

}
</script>

<style scoped>
  .user_table{
    border-radius: 20px;
    box-shadow:0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04)
  }
</style>