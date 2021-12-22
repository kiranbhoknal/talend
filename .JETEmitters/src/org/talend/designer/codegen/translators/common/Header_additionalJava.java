package org.talend.designer.codegen.translators.common;

import java.util.Vector;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.IProcess;

public class Header_additionalJava
{
  protected static String nl;
  public static synchronized Header_additionalJava create(String lineSeparator)
  {
    nl = lineSeparator;
    Header_additionalJava result = new Header_additionalJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    @SuppressWarnings(\"serial\")" + NL + "    public static class GenericFaultInfoException extends org.apache.cxf.frontend.FaultInfoException {" + NL + "" + NL + "        private org.dom4j.Document faultInfo;" + NL + "" + NL + "        public GenericFaultInfoException(String arg0, javax.xml.transform.Source source) {" + NL + "            super(arg0);" + NL + "            try {" + NL + "                faultInfo = GenericConsumer.sourceToDocument(source);" + NL + "            } catch (Exception e) {" + NL + "                e.printStackTrace();" + NL + "            }" + NL + "        }" + NL + "" + NL + "        public org.dom4j.Document getFaultInfo() {" + NL + "            return faultInfo;" + NL + "        }" + NL + "    }" + NL + "" + NL + "    static interface GenericServiceClass {" + NL + "        Object invoke(Object param) throws GenericFaultInfoException;" + NL + "    }" + NL + "" + NL + "    static class GenericConsumer {" + NL + "" + NL + "        private static final javax.xml.transform.TransformerFactory FACTORY = javax.xml.transform.TransformerFactory.newInstance();" + NL + "" + NL + "        private javax.xml.namespace.QName serviceQName;" + NL + "        private javax.xml.namespace.QName portQName;" + NL + "        private javax.xml.namespace.QName operationQName;" + NL + "        private boolean isRequestResponse;" + NL + "        private String soapAction;" + NL + "        private String address;" + NL + "        private String wsdlURL;" + NL + "" + NL + "        private java.util.Collection<org.apache.cxf.feature.Feature> esbFeatures;" + NL + "        private org.apache.cxf.Bus bus;" + NL + "" + NL + "        private String authType;" + NL + "        private String username;" + NL + "        private String password;" + NL + "" + NL + "        private String proxyServer;" + NL + "        private int proxyPort;" + NL + "        private String proxyUsername;" + NL + "        private String proxyPassword;" + NL + "" + NL + "        private long connectionTimeout;" + NL + "        private long receiveTimeout;" + NL + "        " + NL + "        private boolean autoRedirect;" + NL + "        private boolean disableChunking;" + NL + "        private boolean redirectSameHostOnly;" + NL + "" + NL + "        private boolean logMessages;" + NL + "" + NL + "        private java.util.Collection<org.apache.cxf.headers.Header> soapHeaders;" + NL + "" + NL + "        private Object correlationIDCallbackHandler;" + NL + "        " + NL + "        private java.util.Map<String, String> samCustomProperties;" + NL + "" + NL + "        private String correlationID;" + NL + "        " + NL + "        private java.util.Map<String, List<?>> httpResponseHeaders;" + NL + "        private java.lang.Integer httpResponseCode;" + NL + "" + NL + "        public void setServiceQName(javax.xml.namespace.QName serviceQName) {" + NL + "            this.serviceQName = serviceQName;" + NL + "        }" + NL + "" + NL + "        public void setPortQName(javax.xml.namespace.QName portQName) {" + NL + "            this.portQName = portQName;" + NL + "        }" + NL + "" + NL + "        public void setOperationQName(javax.xml.namespace.QName operationQName) {" + NL + "            this.operationQName = operationQName;" + NL + "        }" + NL + "" + NL + "        public void setIsRequestResponse(boolean isRequestResponse) {" + NL + "            this.isRequestResponse = isRequestResponse;" + NL + "        }" + NL + "" + NL + "        public void setSoapAction(String soapAction) {" + NL + "            this.soapAction = soapAction;" + NL + "        }" + NL + "" + NL + "        public void setAddress(String address) {" + NL + "            this.address = address;" + NL + "        }" + NL + "" + NL + "        public void setWsdlURL(String wsdlURL) {" + NL + "            this.wsdlURL = wsdlURL;" + NL + "        }" + NL + "" + NL + "        public void setEsbFeatures(" + NL + "                java.util.Collection<org.apache.cxf.feature.Feature> esbFeatures) {" + NL + "            this.esbFeatures = esbFeatures;" + NL + "        }" + NL + "" + NL + "        public void setBus(org.apache.cxf.Bus bus) {" + NL + "            this.bus = bus;" + NL + "        }" + NL + "" + NL + "        public void setAuthType(String authType) {" + NL + "            this.authType = authType;" + NL + "        }" + NL + "" + NL + "        public void setUsername(String username) {" + NL + "            this.username = username;" + NL + "        }" + NL + "" + NL + "        public void setPassword(String password) {" + NL + "            this.password = password;" + NL + "        }" + NL + "" + NL + "        public void setProxyServer(String proxyServer) {" + NL + "            this.proxyServer = proxyServer;" + NL + "        }" + NL + "" + NL + "        public void setProxyPort(int proxyPort) {" + NL + "            this.proxyPort = proxyPort;" + NL + "        }" + NL + "" + NL + "        public void setProxyUsername(String proxyUsername) {" + NL + "            this.proxyUsername = proxyUsername;" + NL + "        }" + NL + "" + NL + "        public void setProxyPassword(String proxyPassword) {" + NL + "            this.proxyPassword = proxyPassword;" + NL + "        }" + NL + "" + NL + "        public void setConnectionTimeout(long connectionTimeout) {" + NL + "            this.connectionTimeout = connectionTimeout;" + NL + "        }" + NL + "" + NL + "        public void setReceiveTimeout(long receiveTimeout) {" + NL + "            this.receiveTimeout = receiveTimeout;" + NL + "        }" + NL + "" + NL + "        public void setAutoRedirect(boolean autoRedirect) {" + NL + "            this.autoRedirect = autoRedirect;" + NL + "        }" + NL + "" + NL + "        public void setDisableChunking(boolean disableChunking) {" + NL + "            this.disableChunking = disableChunking;" + NL + "        }" + NL + "        " + NL + "        public void setRedirectSameHostOnly(boolean redirectSameHostOnly) {" + NL + "            this.redirectSameHostOnly = redirectSameHostOnly;" + NL + "        }" + NL + "" + NL + "        public void setLogMessages(boolean logMessages) {" + NL + "            this.logMessages = logMessages;" + NL + "        }" + NL + "" + NL + "        public void setSoapHeaders(java.util.Collection<org.apache.cxf.headers.Header> soapHeaders) {" + NL + "            this.soapHeaders = soapHeaders;" + NL + "        }" + NL + "        " + NL + "        public java.util.Map<String, List<?>> getHttpResponseHeaders(){" + NL + "        \treturn this.httpResponseHeaders;" + NL + "        }" + NL + "        " + NL + "        public java.lang.Integer getHttpResponseCode(){" + NL + "        \treturn this.httpResponseCode;" + NL + "        }" + NL + "        " + NL + "        public void setCorrelationIDCallbackHandler(Object correlationIDCallbackHandler) {" + NL + "            this.correlationIDCallbackHandler = correlationIDCallbackHandler;" + NL + "        }" + NL + "        " + NL + "        public void setSamCustomProperties(java.util.Map<String, String> samCustomProperties){" + NL + "        \tthis.samCustomProperties = samCustomProperties;" + NL + "        }" + NL + "" + NL + "        public String getCorrelationID() {" + NL + "            return correlationID;" + NL + "        }" + NL + "" + NL + "        public org.dom4j.Document invoke(org.dom4j.Document doc) throws GenericFaultInfoException, org.apache.cxf.interceptor.Fault {" + NL + "            org.apache.cxf.frontend.ClientFactoryBean clientFactory = new org.apache.cxf.frontend.ClientFactoryBean();" + NL + "            clientFactory.setDataBinding(new org.apache.cxf.databinding.source.SourceDataBinding());" + NL + "            clientFactory.getServiceFactory().getServiceConfigurations().add(0, new org.apache.cxf.wsdl.service.factory.AbstractServiceConfiguration() {" + NL + "                @Override" + NL + "                public Boolean isOperation(java.lang.reflect.Method method) {" + NL + "                    return \"invoke\".equals(method.getName());" + NL + "                }" + NL + "                @Override" + NL + "                public javax.xml.namespace.QName getOperationName(org.apache.cxf.service.model.InterfaceInfo service, java.lang.reflect.Method method) {" + NL + "                    return operationQName;" + NL + "                }" + NL + "                @Override" + NL + "                public Boolean hasOutMessage(java.lang.reflect.Method m) {" + NL + "                    return isRequestResponse;" + NL + "                }" + NL + "                @Override" + NL + "                public String getAction(org.apache.cxf.service.model.OperationInfo op, java.lang.reflect.Method method) {" + NL + "                    return soapAction;" + NL + "                }" + NL + "                @Override" + NL + "                public Boolean isWrapped() {" + NL + "                    return Boolean.FALSE;" + NL + "                }" + NL + "                @Override" + NL + "                public javax.xml.namespace.QName getFaultName(org.apache.cxf.service.model.InterfaceInfo service, org.apache.cxf.service.model.OperationInfo o," + NL + "                        Class<?> exClass, Class<?> beanClass) {" + NL + "                    for (org.apache.cxf.service.model.FaultInfo fi : o.getFaults()) {" + NL + "                        for (org.apache.cxf.service.model.MessagePartInfo mpi : fi.getMessageParts()) {" + NL + "                            return mpi.getConcreteName();" + NL + "                        }" + NL + "                    }" + NL + "                    return null;" + NL + "                }" + NL + "            });" + NL + "            if (null != wsdlURL) {" + NL + "                clientFactory.setWsdlURL(wsdlURL);" + NL + "            }" + NL + "            clientFactory.setServiceClass(GenericServiceClass.class);" + NL + "" + NL + "            clientFactory.setServiceName(serviceQName);" + NL + "            clientFactory.setEndpointName(portQName);" + NL + "" + NL + "            clientFactory.setAddress(address);" + NL + "            clientFactory.getProperties(true).put(\"soap.no.validate.parts\", Boolean.TRUE);" + NL + "" + NL + "            if (null != bus) {" + NL + "                clientFactory.setBus(bus);" + NL + "            }" + NL + "            if (null != esbFeatures) {" + NL + "                clientFactory.getFeatures().addAll(esbFeatures);" + NL + "            }" + NL + "            if (logMessages) {" + NL + "                clientFactory.getFeatures().add(new org.apache.cxf.feature.LoggingFeature());" + NL + "            }" + NL + "            if (null != correlationIDCallbackHandler) {" + NL + "                clientFactory.getProperties(true).put(\"correlation-id.callback-handler\", correlationIDCallbackHandler);" + NL + "            }" + NL + "           \tif(null != samCustomProperties){" + NL + "           \t\tclientFactory.getProperties(true).put(\"SAM-PROPS\", samCustomProperties);" + NL + "           \t\tclientFactory.getProperties(true).put(\"esb.sam.properties\", samCustomProperties);" + NL + "           \t}" + NL + "" + NL + "            org.apache.cxf.endpoint.Client client = clientFactory.create();" + NL + "" + NL + "            org.apache.cxf.transport.http.HTTPConduit conduit = (org.apache.cxf.transport.http.HTTPConduit) client.getConduit();" + NL + "            if (\"BASIC\".equals(authType)) {" + NL + "                org.apache.cxf.configuration.security.AuthorizationPolicy authorizationPolicy = new org.apache.cxf.configuration.security.AuthorizationPolicy();" + NL + "                authorizationPolicy.setUserName(username);" + NL + "                authorizationPolicy.setPassword(password);" + NL + "                authorizationPolicy.setAuthorizationType(\"Basic\");" + NL + "                conduit.setAuthorization(authorizationPolicy);" + NL + "            } else if (\"DIGEST\".equals(authType)) {" + NL + "                org.apache.cxf.configuration.security.AuthorizationPolicy authorizationPolicy = new org.apache.cxf.configuration.security.AuthorizationPolicy();" + NL + "                authorizationPolicy.setUserName(username);" + NL + "                authorizationPolicy.setPassword(password);" + NL + "                authorizationPolicy.setAuthorizationType(\"Digest\");" + NL + "                conduit.setAuthorization(authorizationPolicy);" + NL + "            } else if (\"TOKEN\".equals(authType)) {" + NL + "                java.util.Map<String, Object> wssProps = new java.util.HashMap<String, Object>();" + NL + "                wssProps.put(org.apache.wss4j.common.ConfigurationConstants.ACTION, org.apache.wss4j.common.ConfigurationConstants.USERNAME_TOKEN);" + NL + "                wssProps.put(org.apache.wss4j.common.ConfigurationConstants.USER, username);" + NL + "                wssProps.put(org.apache.wss4j.common.ConfigurationConstants.PASSWORD_TYPE, org.apache.wss4j.common.WSS4JConstants.PW_TEXT);" + NL + "                wssProps.put(org.apache.wss4j.common.ConfigurationConstants.PW_CALLBACK_REF," + NL + "                        new javax.security.auth.callback.CallbackHandler() {" + NL + "                            public void handle(javax.security.auth.callback.Callback[] callbacks)" + NL + "                                    throws java.io.IOException, javax.security.auth.callback.UnsupportedCallbackException {" + NL + "                                ((org.apache.wss4j.common.ext.WSPasswordCallback) callbacks[0]).setPassword(password);" + NL + "                            }" + NL + "                        });" + NL + "                client.getEndpoint()" + NL + "                        .getOutInterceptors().add(new org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor(wssProps));" + NL + "                client.getRequestContext().put(\"ws-security.username\", username);" + NL + "                client.getRequestContext().put(\"ws-security.password\", password);" + NL + "            }";
  protected final String TEXT_2 = NL + "            org.apache.cxf.configuration.jsse.TLSClientParameters clientParameters = new org.apache.cxf.configuration.jsse.TLSClientParameters();" + NL + "            clientParameters.setUseHttpsURLConnectionDefaultHostnameVerifier(true);" + NL + "            conduit.setTlsClientParameters(clientParameters);";
  protected final String TEXT_3 = NL + "            org.apache.cxf.transports.http.configuration.HTTPClientPolicy httpClientPolicy = conduit.getClient();" + NL + "            if (null != proxyServer) {" + NL + "                httpClientPolicy.setProxyServerType(org.apache.cxf.transports.http.configuration.ProxyServerType.HTTP);" + NL + "                httpClientPolicy.setProxyServer(proxyServer);" + NL + "                httpClientPolicy.setProxyServerPort(proxyPort);" + NL + "            }" + NL + "            if (null != proxyUsername && !\"\".equals(proxyUsername)) {" + NL + "                org.apache.cxf.configuration.security.ProxyAuthorizationPolicy proxyAuthorization = new org.apache.cxf.configuration.security.ProxyAuthorizationPolicy();" + NL + "                proxyAuthorization.setUserName(proxyUsername);" + NL + "                proxyAuthorization.setPassword(proxyPassword);" + NL + "                conduit.setProxyAuthorization(proxyAuthorization);" + NL + "            }" + NL + "            httpClientPolicy.setConnectionTimeout(connectionTimeout);" + NL + "            httpClientPolicy.setReceiveTimeout(receiveTimeout);" + NL + "            if (autoRedirect) {" + NL + "                httpClientPolicy.setAutoRedirect(autoRedirect);" + NL + "                client.getRequestContext().put(\"http.redirect.relative.uri\", true);" + NL + "                client.getRequestContext().put(\"http.redirect.same.host.only\", redirectSameHostOnly);" + NL + "            }" + NL + "            if (disableChunking) {" + NL + "                httpClientPolicy.setAllowChunking(false);" + NL + "            }" + NL + "            if (null != soapHeaders) {" + NL + "                client.getRequestContext().put(org.apache.cxf.headers.Header.HEADER_LIST, soapHeaders);" + NL + "            }" + NL + "" + NL + "            try {" + NL + "                javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();" + NL + "                Object[] results = client.invoke(operationQName," + NL + "                        factory.newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.StringReader(doc.asXML()))));" + NL + "                correlationID = (String) client.getResponseContext().get(\"CorrelationID\");" + NL + "\t\t\t\thttpResponseHeaders = (java.util.Map<String, java.util.List<?>>) client" + NL + "\t\t\t\t\t\t.getResponseContext().get(org.apache.cxf.message.Message.PROTOCOL_HEADERS);" + NL + "\t\t\t\thttpResponseCode = (Integer) client.getResponseContext().get(org.apache.cxf.message.Message.RESPONSE_CODE);" + NL + "                if (results != null && results.length > 0) {" + NL + "                    return sourceToDocument((javax.xml.transform.Source) results[0]);" + NL + "                }" + NL + "            } catch (GenericFaultInfoException e) {" + NL + "                throw e;" + NL + "            } catch (org.apache.cxf.interceptor.Fault e) {" + NL + "                throw e;" + NL + "            } catch (Exception e) {" + NL + "                throw new org.apache.cxf.interceptor.Fault(e);" + NL + "            }" + NL + "            return null;" + NL + "        }" + NL + "" + NL + "        public static org.dom4j.Document sourceToDocument(javax.xml.transform.Source source) throws Exception{" + NL + "            java.io.ByteArrayOutputStream os = new java.io.ByteArrayOutputStream();" + NL + "            FACTORY.newTransformer().transform(source, new javax.xml.transform.stream.StreamResult(os));" + NL + "            return new org.dom4j.io.SAXReader().read(new java.io.ByteArrayInputStream(os.toByteArray()));" + NL + "        }" + NL + "" + NL + "    }" + NL + "\t" + NL + "\tpublic class HttpHeadersFeature extends" + NL + "\t\t\torg.apache.cxf.feature.AbstractFeature {" + NL + "" + NL + "\t\tpublic final static String HTTP_HEADERS = \"http_headers\";" + NL + "\t\tpublic final static String HTTP_RESPONSE_CODE = \"http_response_code\";" + NL + "" + NL + "\t\tprivate HttpHeadersOutInterceptor out = new HttpHeadersOutInterceptor();" + NL + "\t\tprivate HttpHeadersInInterceptor in = new HttpHeadersInInterceptor();" + NL + "" + NL + "\t\tpublic HttpHeadersFeature(List<java.util.Map<String, String>> headers) {" + NL + "\t\t\tout.setHeaders(headers);" + NL + "\t\t}" + NL + "" + NL + "\t\tpublic HttpHeadersOutInterceptor getOutInterceptor() {" + NL + "\t\t\treturn out;" + NL + "\t\t}" + NL + "" + NL + "\t\tpublic HttpHeadersInInterceptor getInInterceptor() {" + NL + "\t\t\treturn in;" + NL + "\t\t}" + NL + "" + NL + "\t\tpublic java.util.Map<String, List<?>> getResponseHeaders() {" + NL + "\t\t\treturn getInInterceptor().getHeaders();" + NL + "\t\t}" + NL + "" + NL + "\t\tpublic java.lang.Integer getResponseCode() {" + NL + "\t\t\treturn getInInterceptor().getResponseCode();" + NL + "\t\t}" + NL + "" + NL + "\t\t@Override" + NL + "\t\tprotected void initializeProvider(" + NL + "\t\t\t\torg.apache.cxf.interceptor.InterceptorProvider provider," + NL + "\t\t\t\torg.apache.cxf.Bus bus) {" + NL + "\t\t\tprovider.getOutInterceptors().add(out);" + NL + "\t\t\tprovider.getInInterceptors().add(in);" + NL + "\t\t}" + NL + "" + NL + "\t\tpublic class HttpHeadersOutInterceptor" + NL + "\t\t\t\textends" + NL + "\t\t\t\torg.apache.cxf.phase.AbstractPhaseInterceptor<org.apache.cxf.message.Message> {" + NL + "" + NL + "\t\t\tprivate List<java.util.Map<String, String>> headers = null;" + NL + "" + NL + "\t\t\tpublic HttpHeadersOutInterceptor() {" + NL + "                            super(org.apache.cxf.phase.Phase.MARSHAL);" + NL + "                            super.addBefore(org.apache.cxf.wsdl.interceptors.BareOutInterceptor.class.getName());" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tpublic void setHeaders(List<java.util.Map<String, String>> headers) {" + NL + "\t\t\t\tthis.headers =  headers;" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\t@Override" + NL + "\t\t\tpublic void handleMessage(org.apache.cxf.message.Message message)" + NL + "\t\t\t\t\tthrows org.apache.cxf.interceptor.Fault {" + NL + "\t\t\t\tjava.util.Map<String, List> httpHeaders = (java.util.Map<String, List>) message" + NL + "\t\t\t\t\t\t.get(org.apache.cxf.message.Message.PROTOCOL_HEADERS);" + NL + "\t\t\t\t" + NL + "\t\t\t\tmessage.put(org.apache.cxf.transport.http.Headers.ADD_HEADERS_PROPERTY,\ttrue);" + NL + "\t\t\t\ttry {" + NL + "\t\t\t\t\tfor (java.util.Map<String, String> header : headers) {" + NL + "\t\t\t\t\t\tfor (java.util.Map.Entry<String, String> h : header" + NL + "\t\t\t\t\t\t\t\t.entrySet()) {" + NL + "\t\t\t\t\t\t\tString k = h.getKey();" + NL + "\t\t\t\t\t\t\tif (k == null || k == \"\")" + NL + "\t\t\t\t\t\t\t\tcontinue;" + NL + "\t\t\t\t\t\t\tList<String> v = httpHeaders.get(k);" + NL + "\t\t\t\t\t\t\tif (v == null) {" + NL + "\t\t\t\t\t\t\t\tv = new java.util.ArrayList<String>();" + NL + "\t\t\t\t\t\t\t\thttpHeaders.put(k, v);" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\tv.add(h.getValue());" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t} catch (Exception ce) {" + NL + "\t\t\t\t\tthrow new org.apache.cxf.interceptor.Fault(ce);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "" + NL + "\t\tpublic class HttpHeadersInInterceptor" + NL + "\t\t\t\textends" + NL + "\t\t\t\torg.apache.cxf.phase.AbstractPhaseInterceptor<org.apache.cxf.message.Message> {" + NL + "" + NL + "\t\t\tprivate java.util.Map<String, List<?>> httpHeaders = new java.util.TreeMap<String, List<?>>(" + NL + "\t\t\t\t\tString.CASE_INSENSITIVE_ORDER);" + NL + "\t\t\tprivate java.lang.Integer responseCode = new java.lang.Integer(0);" + NL + "" + NL + "\t\t\tpublic HttpHeadersInInterceptor() {" + NL + "\t\t\t\tsuper(org.apache.cxf.phase.Phase.POST_PROTOCOL);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t\t@Override" + NL + "\t\t\tpublic void handleMessage(org.apache.cxf.message.Message message)" + NL + "\t\t\t\t\tthrows org.apache.cxf.interceptor.Fault {" + NL + "" + NL + "\t\t\t\ttry {" + NL + "\t\t\t\t\tthis.httpHeaders = ((java.util.Map<String, List<?>>) message" + NL + "\t\t\t\t\t\t\t.get(org.apache.cxf.message.Message.PROTOCOL_HEADERS));" + NL + "\t\t\t\t\tthis.responseCode = (java.lang.Integer) message" + NL + "\t\t\t\t\t\t\t.get(org.apache.cxf.message.Message.RESPONSE_CODE);" + NL + "\t\t\t\t} catch (Exception ce) {" + NL + "\t\t\t\t\tthrow new org.apache.cxf.interceptor.Fault(ce);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t\t@Override" + NL + "\t\t\tpublic void handleFault(org.apache.cxf.message.Message message)" + NL + "\t\t\t\t\tthrows org.apache.cxf.interceptor.Fault {" + NL + "" + NL + "\t\t\t\ttry {" + NL + "\t\t\t\t\tthis.httpHeaders = ((java.util.Map<String, List<?>>) message" + NL + "\t\t\t\t\t\t\t.get(org.apache.cxf.message.Message.PROTOCOL_HEADERS));" + NL + "\t\t\t\t\tthis.responseCode = (java.lang.Integer) message" + NL + "\t\t\t\t\t\t\t.get(org.apache.cxf.message.Message.RESPONSE_CODE);" + NL + "\t\t\t\t} catch (Exception ce) {" + NL + "\t\t\t\t\tthrow new org.apache.cxf.interceptor.Fault(ce);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tpublic java.util.Map<String, List<?>> getHeaders() {" + NL + "\t\t\t\treturn httpHeaders;" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tpublic java.lang.Integer getResponseCode() {" + NL + "\t\t\t\treturn responseCode;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "    private static java.util.Map<String, Object> collectFaultInfo(Exception error) {" + NL + "        String faultString = null;" + NL + "        String faultActor = null;" + NL + "        String faultCode = null;" + NL + "        String faultRole = null;" + NL + "        String faultNode = null;" + NL + "        org.dom4j.Document faultDetail = null;" + NL + "        org.w3c.dom.Element faultDomDetail = null;" + NL + "" + NL + "        if (error instanceof org.apache.cxf.binding.soap.SoapFault) {" + NL + "            org.apache.cxf.binding.soap.SoapFault cxfSoapFault = (org.apache.cxf.binding.soap.SoapFault) error;" + NL + "" + NL + "            faultString = cxfSoapFault.getReason();" + NL + "            faultCode = cxfSoapFault.getFaultCode().toString();" + NL + "            faultRole = cxfSoapFault.getRole();" + NL + "            faultNode = cxfSoapFault.getNode();" + NL + "            faultDomDetail = cxfSoapFault.getDetail();" + NL + "        } else if (error instanceof GenericFaultInfoException) {" + NL + "            GenericFaultInfoException genericFault = (GenericFaultInfoException) error;" + NL + "" + NL + "            faultString = genericFault.getMessage();" + NL + "            faultDetail = genericFault.getFaultInfo();" + NL + "        } else if (error instanceof javax.xml.ws.soap.SOAPFaultException) {" + NL + "            javax.xml.soap.SOAPFault wsSoapFault = ((javax.xml.ws.soap.SOAPFaultException) error).getFault();" + NL + "" + NL + "            faultString = wsSoapFault.getFaultString();" + NL + "            faultActor = wsSoapFault.getFaultActor();" + NL + "            faultCode = wsSoapFault.getFaultCodeAsQName().toString();" + NL + "" + NL + "            if (javax.xml.soap.SOAPConstants.URI_NS_SOAP_1_2_ENVELOPE.equals(wsSoapFault.getNamespaceURI())) {" + NL + "                // SOAP 1.2" + NL + "                try {" + NL + "                    faultRole = wsSoapFault.getFaultRole();" + NL + "                    faultNode = wsSoapFault.getFaultNode();" + NL + "                } catch (java.lang.UnsupportedOperationException uoe) { }" + NL + "            }" + NL + "" + NL + "            faultDomDetail = wsSoapFault.getDetail();" + NL + "        } else {" + NL + "            return null;" + NL + "        }" + NL + "" + NL + "        java.util.Map<String, Object> faultInfo = new java.util.HashMap<String, Object>();" + NL + "        faultInfo.put(\"faultString\", faultString);" + NL + "        faultInfo.put(\"faultActor\", faultActor);" + NL + "        faultInfo.put(\"faultCode\", faultCode);" + NL + "        faultInfo.put(\"faultRole\", faultRole);" + NL + "        faultInfo.put(\"faultNode\", faultNode);" + NL + "        if (null != faultDomDetail) {" + NL + "            org.w3c.dom.NodeList nl = faultDomDetail.getElementsByTagName(\"*\");" + NL + "            if (nl.getLength() > 0) {" + NL + "                try {" + NL + "                    javax.xml.transform.Source faultSource = new javax.xml.transform.dom.DOMSource(" + NL + "                            nl.item(0));" + NL + "                    faultDetail = GenericConsumer.sourceToDocument(faultSource);" + NL + "                } catch (Exception e) {" + NL + "                    e.printStackTrace();" + NL + "                }" + NL + "            }" + NL + "        }" + NL + "        faultInfo.put(\"faultDetail\", faultDetail);" + NL + "        return faultInfo;" + NL + "    }" + NL + "" + NL + "    private void printFaultInfo(java.util.Map<String, Object> faultInfo) {" + NL + "        java.lang.StringBuffer sb = new java.lang.StringBuffer(\"Fault {\");" + NL + "        sb.append(\"string: \").append(faultInfo.get(\"faultString\"));" + NL + "        if (null != faultInfo.get(\"faultCode\")) {" + NL + "            sb.append(\"; code:\").append(faultInfo.get(\"faultCode\"));" + NL + "        }" + NL + "        if (null != faultInfo.get(\"faultActor\")) {" + NL + "            sb.append(\"; actor:\").append(faultInfo.get(\"faultActor\"));" + NL + "        }" + NL + "        if (null != faultInfo.get(\"faultRole\")) {" + NL + "            sb.append(\"; role:\").append(faultInfo.get(\"faultRole\"));" + NL + "        }" + NL + "        if (null != faultInfo.get(\"faultNode\")) {" + NL + "            sb.append(\"; node:\").append(faultInfo.get(\"faultNode\"));" + NL + "        }" + NL + "        if (null != faultInfo.get(\"faultDetail\")) {" + NL + "            sb.append(\"; detail:\").append(((org.dom4j.Document) faultInfo.get(\"faultDetail\")).asXML());" + NL + "        }" + NL + "        sb.append(\"}\");" + NL + "        System.out.println(sb.toString());" + NL + "    }" + NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "    private Object wrapPayload(Object payload) {" + NL + "        java.util.Map<String, Object> outputWrapped = new java.util.HashMap<String, Object>();" + NL + "        outputWrapped.put(\"PAYLOAD\", payload);" + NL + "        return outputWrapped;" + NL + "    }";
  protected final String TEXT_6 = NL + NL + NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
Vector v = (Vector) codeGenArgument.getArgument();
IProcess process = (IProcess) v.get(0);

boolean actAsProvider = !process.getNodesOfType("tESBProviderRequest").isEmpty();
boolean actAsConsumer = !process.getNodesOfType("tESBConsumer").isEmpty();
if (actAsConsumer) {

    stringBuffer.append(TEXT_1);
    
    /*tSetKeystore-TESB-22406*/
    if (!process.getNodesOfType("tSetKeystore").isEmpty()) {
        INode keystoreNode = process.getNodesOfType("tSetKeystore").get(0);
        if(("false").equals(ElementParameterParser.getValue(keystoreNode, "__VERIFY_NAME__"))){

    stringBuffer.append(TEXT_2);
    
        }
    }

    stringBuffer.append(TEXT_3);
     } // end if (actAsConsumer) 
    stringBuffer.append(TEXT_4);
     if (actAsProvider || actAsConsumer) {
    stringBuffer.append(TEXT_5);
     } 
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
