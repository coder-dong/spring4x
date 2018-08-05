/*
 * XML Type:  userType
 * Namespace: 
 * Java type: com.smart.oxm.xmlbeans.UserType
 *
 * Automatically generated - do not modify.
 */
package com.smart.oxm.xmlbeans;


/**
 * An XML userType(@).
 *
 * This is a complex type.
 */
public interface UserType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s89313323D390BE07A83A0DA958C9965D").resolveHandle("usertypea30etype");
    
    /**
     * Gets the "userId" element
     */
    String getUserId();
    
    /**
     * Gets (as xml) the "userId" element
     */
    org.apache.xmlbeans.XmlString xgetUserId();
    
    /**
     * Sets the "userId" element
     */
    void setUserId(String userId);
    
    /**
     * Sets (as xml) the "userId" element
     */
    void xsetUserId(org.apache.xmlbeans.XmlString userId);
    
    /**
     * Gets the "userName" element
     */
    String getUserName();
    
    /**
     * Gets (as xml) the "userName" element
     */
    org.apache.xmlbeans.XmlString xgetUserName();
    
    /**
     * Sets the "userName" element
     */
    void setUserName(String userName);
    
    /**
     * Sets (as xml) the "userName" element
     */
    void xsetUserName(org.apache.xmlbeans.XmlString userName);
    
    /**
     * Gets the "password" element
     */
    String getPassword();
    
    /**
     * Gets (as xml) the "password" element
     */
    org.apache.xmlbeans.XmlString xgetPassword();
    
    /**
     * Sets the "password" element
     */
    void setPassword(String password);
    
    /**
     * Sets (as xml) the "password" element
     */
    void xsetPassword(org.apache.xmlbeans.XmlString password);
    
    /**
     * Gets the "credits" element
     */
    int getCredits();
    
    /**
     * Gets (as xml) the "credits" element
     */
    org.apache.xmlbeans.XmlInt xgetCredits();
    
    /**
     * Sets the "credits" element
     */
    void setCredits(int credits);
    
    /**
     * Sets (as xml) the "credits" element
     */
    void xsetCredits(org.apache.xmlbeans.XmlInt credits);
    
    /**
     * Gets the "lastIp" element
     */
    String getLastIp();
    
    /**
     * Gets (as xml) the "lastIp" element
     */
    org.apache.xmlbeans.XmlString xgetLastIp();
    
    /**
     * Sets the "lastIp" element
     */
    void setLastIp(String lastIp);
    
    /**
     * Sets (as xml) the "lastIp" element
     */
    void xsetLastIp(org.apache.xmlbeans.XmlString lastIp);
    
    /**
     * Gets the "logs" element
     */
    Logs getLogs();
    
    /**
     * Sets the "logs" element
     */
    void setLogs(Logs logs);
    
    /**
     * Appends and returns a new empty "logs" element
     */
    Logs addNewLogs();
    
    /**
     * An XML logs(@).
     *
     * This is a complex type.
     */
    public interface Logs extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Logs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s89313323D390BE07A83A0DA958C9965D").resolveHandle("logsf3f3elemtype");
        
        /**
         * Gets array of all "loginLog" elements
         */
        LogType[] getLoginLogArray();
        
        /**
         * Gets ith "loginLog" element
         */
        LogType getLoginLogArray(int i);
        
        /**
         * Returns number of "loginLog" element
         */
        int sizeOfLoginLogArray();
        
        /**
         * Sets array of all "loginLog" element
         */
        void setLoginLogArray(LogType[] loginLogArray);
        
        /**
         * Sets ith "loginLog" element
         */
        void setLoginLogArray(int i, LogType loginLog);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "loginLog" element
         */
        LogType insertNewLoginLog(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "loginLog" element
         */
        LogType addNewLoginLog();
        
        /**
         * Removes the ith "loginLog" element
         */
        void removeLoginLog(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static Logs newInstance() {
              return (Logs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static Logs newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (Logs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static UserType newInstance() {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static UserType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static UserType parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static UserType parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static UserType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static UserType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static UserType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static UserType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static UserType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static UserType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static UserType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static UserType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static UserType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static UserType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static UserType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static UserType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static UserType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static UserType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (UserType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
