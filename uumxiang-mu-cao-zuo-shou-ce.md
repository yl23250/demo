# 项目部署

## jenkins部署

* 访问地址：[http://172.30.43.251:8080/view/公共基础服务/](http://172.30.43.251:8080/view/公共基础服务/)

### 开发环境

* **公共基础服务**——**service\_uum **——构建——Dev部署service\(公共基础服务\)-部署-完成

### 测试环境

* 登录帐号-选择TAB【**Tester**】-**Test\_Build\_Services\(公共基础服务\) **——【Build with Parameters】——【uum-provider】        

## web部署

* jenkins地址：    [http://172.30.43.251:8080/view/云平台一期/job/yosemite\_app\_development/](http://172.30.43.251:8080/view/云平台一期/job/yosemite_app_development/)

* jenkins测试地址：http://172.30.43.251:8080/job/yosemite\_app\_test/modules

* 导出uum-web.war

| 环境 | 服务器地址 | 帐号密码 | 部署路径 |
| :--- | :--- | :--- | :--- |
| UUM-web-开发环境 | 244 | yosemite/Hzda123.. | data/webapps/uum-web-18280/webapps |
| UUM-web-测试环境 | 247 |  | /home/webapps/uum-web-18280/webapps |
| UUM测试环境 | 248 |  | /home/yosemite\_services/uum-provider |
| UUM开发环境 | 245 |  | data/yosemite\_services/uum-provider/bin |



