<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page language="java" import="com.harvey.fb.api.common.Constants" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.7.1/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/jshashtable-2.1_src.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/jquery.json-2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/jquery.iframe-post-form.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/jquery.numberformatter-1.2.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/jquery.tooltip.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/jquery.placeholder.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/jquery.cookie.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath }${applicationScope.config['query.configJsUrlPattern'] }"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/datepicker/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/utils/validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/utils/enterAsTab.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/utils/msgBox.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/application.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/utils/combogridOptions.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/utils/common.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/ajaxfileupload.js"></script>
<script type="text/javascript">
  app.setContextPath('${pageContext.request.contextPath}');
  function $url(url){
    if(!url || url.startsWith('http:') || url.startsWith('https:')){
      return url;
    }else if(url.charAt(0)=='/'){
      return '${pageContext.request.contextPath}'+url;
    }else{
      return '${pageContext.request.contextPath}/'+url;
    }
  }
  function $rest(rest,method){
    return $url( '/rest/'+rest+'/'+method+'.json');
  }
  $.postJSON = function(url,data,cb){
    $.ajax({
      url:url,
      data : JSON.stringify(data),
      contentType:'application/json;charset=utf-8',
      success:cb,
      type:'POST',
      dataType:'JSON'
    });
  }
</script>
<style type="text/css">
	.datagrid-row-alt{
	  background:#e8f5ff;
	}	
	* {
/* 	    font-size: 14px; */
	}
</style>

