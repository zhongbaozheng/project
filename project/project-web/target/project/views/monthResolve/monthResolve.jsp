<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/views/commons/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>年度建设任务按月分解表</title>
<script type="text/javascript">

	yepnope({
		load : ['${ctx}/resources/js/monthResolve/MonthResolvePanel.js',
            '${ctx}/resources/js/monthResolve/MonthResolveWindow.js',
            '${ctx}/resources/js/monthResolve/MonthResolveFormPanel.js',
            '${ctx}/resources/js/tree/ProjectTreePanel.js'],
		complete : function() {
			var panel = new Ext.project.MonthResolvePanel({
				height : index.tabPanel.getInnerHeight() - 1,
				id : '${param.id}' + '_panel',
                actionJson : ${actionJson},
				renderTo : '${param.id}'
			});
		}

	});
</script>
</head>

<body>
	<div id="${param.id }"></div>
</body>
</html>
