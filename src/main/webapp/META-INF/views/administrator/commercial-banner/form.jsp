<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
    <acme:form-url code="administrator.commercial-banner.form.label.picture-url" path="pictureURL"/>
	<acme:form-textbox code="administrator.commercial-banner.form.label.slogan" path="slogan"/>	
	<acme:form-url code="administrator.commercial-banner.form.label.target-url" path="targetURL"/>
	<acme:form-textbox code="administrator.commercial-banner.form.label.credit-card" path="creditCard"/>

  	<acme:form-return code="administrator.commercial-banner.form.button.return"/>
</acme:form>
