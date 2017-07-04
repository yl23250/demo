

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





