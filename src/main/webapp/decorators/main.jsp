<!DOCTYPE html>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
		<title><decorator:title default="http://wbotelhos.com"/></title>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" >
		<decorator:head/>
	</head>
	<body id="corpo">
		<div id="geral"> <!-- 0 -->
			
    	  	<div id="topo">
    	  		<%@ include file="header.jsp" %>
    	  	</div> <!-- 1 -->
      		
      		<div id="conteudo">

	      		<div id="sub-conteudo">
	      			<decorator:body/>
	      		</div> <!-- 4 -->
	      		
			</div>
			
	      	<div id="rodape">
	      		<%@ include file="footer.jsp" %>
	      	</div> <!-- 6 -->
    	</div>
	</body>
</html>