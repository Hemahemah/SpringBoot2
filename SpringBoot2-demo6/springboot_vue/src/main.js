import Vue from 'vue'
import App from './App.vue'
import {
  Button,
  Card,
  Col,
  Footer,
  Header,
  Main,
  Message, MessageBox,
  Pagination,
  Popconfirm, Popover,
  Row,
  Table,
  TableColumn,
} from "element-ui";


Vue.config.productionTip = false
Vue.component(Row.name,Row)
Vue.component(Col.name,Col)
Vue.component(Table.name,Table)
Vue.component(Main.name,Main)
Vue.component(TableColumn.name,TableColumn)
Vue.component(Pagination.name,Pagination)
Vue.component(Header.name,Header)
Vue.component(Footer.name,Footer)
Vue.component(Message.name,Message)
Vue.component(Button.name,Button)
Vue.component(Popconfirm.name,Popconfirm)
Vue.component(Card.name,Card)
Vue.component(Popover.name,Popover)

new Vue({
  render: h => h(App),
  beforeCreate() {
    Vue.prototype.$message = Message
    Vue.prototype.$confirm = MessageBox.confirm
  }
}).$mount('#app')
