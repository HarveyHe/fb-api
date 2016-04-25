<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.7.1/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-plugins/jquery.json-2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/application.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/utils/common.js"></script>

<script type="text/javascript">
	var restUrl = 'http://localhost:8080/fb-api/rest';
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
  };
</script>

