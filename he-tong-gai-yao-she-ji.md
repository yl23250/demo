**合同管理模块概要设计**

# 1.总体设计

## 1.1 流程图

## 1.2.结构

# 2. 接口设计

## 2.1用户接口


### 2.1.1平台端(MALLP)

| 接口名称   |接口描述     |  接口地址(alias)   |
| :------------- | :------------- |  :------------- |
|添加合同 |  |  |
| 合同名称重复校验接口 | Item Two | Item Two |
| 供方下拉列表接口 | Item Two | Item Two |
| 合同项目下拉数据接口（字典type=合同项目） | Item Two | Item Two |
| 合同类型下拉数据接口（字典type=合同类型） | Item Two | Item Two |
| 供应商性质下拉数据接口（字典type=供应商性质）      | Item Two       | Item Two       |
| 供应商分类下拉数据接口（字典type=供应商分类）     | Item Two       | Item Two       |
| 供应商业务性质下拉数据接口（字典type=业务性质）         | Item Two       | Item Two       |
| 定向合同可选的下游客户列表      | Item Two       | Item Two       |
| 定向合同已选的下游客户列表      | Item Two       | Item Two       |
| 区域列表      | Item Two       | Item Two       |
| 区域列表      | Item Two       | Item Two       |
| 查看合同      | 平台端查看包含合同主信息与保密信息，供应商端与采购商端只有基本信息       | Item Two       |
| 查看合同产品列表      | Item Two       | Item Two       |
| 保存合同(添加、编辑确认触发)      | Item Two       | Item Two       |
|编辑合同 |  |  |
| 添加/编辑保存合同产品(支持批量)      | Item Two       | Item Two       |
| 可添加的合同产品列表      | Item Two       | Item Two       |
| 修改合同产品价格      | Item Two       | Item Two       |
| 删除合同产品     | Item Two       | Item Two       |
| 合同操作日志查看接口     | Item Two       | Item Two       |
| 设置合同无效 | Item Two | Item Two |

### 2.1.2供应商端(MALLS)

> 提交给前端人员测试使用，此处为概要设计，只要描述接口简要信息


| 接口名称   |接口描述     |  接口地址(alias)   |
| :------------- | :------------- |  :------------- |
| 添加合同       | Item Two       | Item Two       |
| Item One       | Item Two       | Item Two       |
| Item One       | Item Two       | Item Two       |
| Item One       | Item Two       | Item Two       |
| Item One       | Item Two       | Item Two       |

### 2.1.3采购商端(MALL)

| 接口名称   |接口描述     |  接口地址(alias)   |
| :------------- | :------------- |  :------------- |
| Item One       | Item Two       | Item Two       |
| Item One       | Item Two       | Item Two       |
| Item One       | Item Two       | Item Two       |
| Item One       | Item Two       | Item Two       |
| Item One       | Item Two       | Item Two       |



## 2.2外部接口

> 交付给商城以外的APP调用的公共接口


# 3.系统数据结构设计

## 3.1 逻辑机构设计要点

| 表名CN | 表名CODE     |
| :------------- | :------------- |
| Item One       | Item Two       |
| Item One       | Item Two       |
| Item One       | Item Two       |
| Item One       | Item Two       |

## 3.2 物理结构设计要点

详见powerdesign PY设计

# 4.系统出错设计处理

## 4.1 出错信息

## 4.2 补救措施

## 4.3 系统设计备份
