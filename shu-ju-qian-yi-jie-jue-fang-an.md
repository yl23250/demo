# 1.存在问题

目前yosemite_uum库的UUM_FUN表中存在一定数量脏数据，根据APP_ID,FUN_CODE,PATH已经无法确定数据是否存在。

# 2.解决方案

在UUM_FUNC表中添加一个字段“UNIQUE_CODE”,
并将“UNIQUE_CODE”设置为唯一索引字段。
然后用程序对现有数据进行清洗：
“UNIQUE_CODE”的组成= parentFuncCoe + funcCode。
如果parentFuncCoe为空，即为一级菜单，则parentFuncCoe
=“_top_”。

# 3.方案描述

清洗程序代码:

```
		for (FuncDto func : funcs) {
			String uniqueCode = "_";
			String paths = func.getPath();
			String[] pathIds = paths.substring(1, paths.length() - 1).split("\\.");
			for (String pathId : pathIds) {
				String funcId = pathId;
				System.out.println(funcId);
				Func parentfunc = funcDao.findFuncById(Long.parseLong(funcId));
				if(parentfunc==null || StringUtils.isEmpty(parentfunc.getFuncCode())){
					uniqueCode +="top"+"_";
				}else{
					uniqueCode += parentfunc.getFuncCode()+"_";
				}

			}
			func.setUniqueCode(uniqueCode);
			funcDao.updateDataByID(func);
		}
```





