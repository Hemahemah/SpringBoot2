<template>
    <div>
      <el-pagination
          background
          layout="prev, pager, next"
          @current-change="currentChange"
          @prev-click="prevClick"
          @next-click="nextClick"
          :page-count="page.pages">
      </el-pagination>
    </div>
</template>

<script>

export default {
  name: "PageInfo",
  props:['page'],
  methods:{
    prevClick(page){
      this.$emit('getEmps',page-1)
    },
    currentChange(page){
      this.$emit('getEmps',page)
    },
    nextClick(page){
      this.$emit('getEmps',page+1)
    }
  }
}
</script>

<style scoped>

</style>