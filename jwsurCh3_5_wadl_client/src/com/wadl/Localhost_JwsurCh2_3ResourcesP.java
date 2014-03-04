
package com.wadl;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configurable;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.uri.UriTemplate;

@Generated(value = {
    "wadl|file:/E:/JAVA/Certification/OCEWSD/wadl-dist-1.1.6-bin/wadl-dist-1.1.6/bin/application.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2014-03-03T15:18:55.241-03:00")
public class Localhost_JwsurCh2_3ResourcesP {

    /**
     * The base URI for the resource represented by this proxy
     * 
     */
    public final static URI BASE_URI;

    static {
        URI originalURI = URI.create("http://localhost:8080/jwsurCh2_3/resourcesP/");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is = Localhost_JwsurCh2_3ResourcesP.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
        if (is!=null) {
            try {
                // Ignore the namespace in the catalog, can't use wildcard until
                // we are sure we have XPath 2.0
                String found = javax.xml.xpath.XPathFactory.newInstance().newXPath().evaluate(
                    "/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" + originalURI +"']/@uri", 
                    new org.xml.sax.InputSource(is)); 
                if (found!=null && found.length()>0) {
                    originalURI = java.net.URI.create(found);
                }
                
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                try {
                    is.close();
                } catch (java.io.IOException e) {
                }
            }
        }
        BASE_URI = originalURI;
    }

    public static Localhost_JwsurCh2_3ResourcesP.Root root(Client client, URI baseURI) {
        return new Localhost_JwsurCh2_3ResourcesP.Root(client, baseURI);
    }

    /**
     * Template method to allow tooling to customize the new Client
     * 
     */
    private static void customizeClientConfiguration(Configurable cc) {
    }

    /**
     * Template method to allow tooling to override Client factory
     * 
     */
    private static Client createClientInstance() {
        return ClientBuilder.newClient();
    }

    /**
     * Create a new Client instance
     * 
     */
    public static Client createClient() {
        Client client = createClientInstance();
        customizeClientConfiguration(client);
        return client;
    }

    public static Localhost_JwsurCh2_3ResourcesP.Root root() {
        return root(createClient(), BASE_URI);
    }

    public static Localhost_JwsurCh2_3ResourcesP.Root root(Client client) {
        return root(client, BASE_URI);
    }

    public static class Root {

        private Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Root(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Root(Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("/");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public Localhost_JwsurCh2_3ResourcesP.Root.DeleteId deleteId(Integer id) {
            return new Localhost_JwsurCh2_3ResourcesP.Root.DeleteId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public Localhost_JwsurCh2_3ResourcesP.Root.Create create() {
            return new Localhost_JwsurCh2_3ResourcesP.Root.Create(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public Localhost_JwsurCh2_3ResourcesP.Root.Update update() {
            return new Localhost_JwsurCh2_3ResourcesP.Root.Update(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public Localhost_JwsurCh2_3ResourcesP.Root.Xml xml() {
            return new Localhost_JwsurCh2_3ResourcesP.Root.Xml(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public Localhost_JwsurCh2_3ResourcesP.Root.XmlId xmlId(Integer id) {
            return new Localhost_JwsurCh2_3ResourcesP.Root.XmlId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public Localhost_JwsurCh2_3ResourcesP.Root.JsonId jsonId(Integer id) {
            return new Localhost_JwsurCh2_3ResourcesP.Root.JsonId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public Localhost_JwsurCh2_3ResourcesP.Root.Json json() {
            return new Localhost_JwsurCh2_3ResourcesP.Root.Json(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public Localhost_JwsurCh2_3ResourcesP.Root.Plain plain() {
            return new Localhost_JwsurCh2_3ResourcesP.Root.Plain(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Create {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Create(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Create(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/create");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T postXWwwFormUrlencodedAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/x-www-form-urlencoded")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T postXWwwFormUrlencodedAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("POST", Entity.entity(input, "application/x-www-form-urlencoded")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class DeleteId {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private DeleteId(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public DeleteId(Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/delete/{id: \\d+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public DeleteId(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/delete/{id: \\d+}");
                } else {
                    template.append("delete/{id: \\d+}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public Localhost_JwsurCh2_3ResourcesP.Root.DeleteId setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new Localhost_JwsurCh2_3ResourcesP.Root.DeleteId(_client, copyUriBuilder, copyMap);
            }

            public<T >T deleteAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T deleteAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("DELETE").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Json {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Json(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Json(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/json");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class JsonId {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private JsonId(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public JsonId(Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/json/{id: \\d+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public JsonId(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/json/{id: \\d+}");
                } else {
                    template.append("json/{id: \\d+}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public Localhost_JwsurCh2_3ResourcesP.Root.JsonId setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new Localhost_JwsurCh2_3ResourcesP.Root.JsonId(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/json");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Plain {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Plain(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Plain(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/plain");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Update {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Update(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Update(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/update");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T putXWwwFormUrlencodedAsTextPlain(Object input, GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/x-www-form-urlencoded")).invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T putXWwwFormUrlencodedAsTextPlain(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("text/plain");
                Response response;
                response = resourceBuilder.build("PUT", Entity.entity(input, "application/x-www-form-urlencoded")).invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Xml {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Xml(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Xml(Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/xml");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class XmlId {

            private Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private XmlId(Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public XmlId(Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/xml/{id: \\d+}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public XmlId(Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/xml/{id: \\d+}");
                } else {
                    template.append("xml/{id: \\d+}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                UriTemplate uriTemplate = new UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public Localhost_JwsurCh2_3ResourcesP.Root.XmlId setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new Localhost_JwsurCh2_3ResourcesP.Root.XmlId(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (response.getStatus()>= 400) {
                    throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                }
                return response.readEntity(returnType);
            }

            public<T >T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                WebTarget resource = _client.target(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                javax.ws.rs.client.Invocation.Builder resourceBuilder = resource.request("application/xml");
                Response response;
                response = resourceBuilder.build("GET").invoke();
                if (!Response.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new Localhost_JwsurCh2_3ResourcesP.WebApplicationExceptionMessage(response);
                    }
                }
                if (!Response.class.isAssignableFrom(returnType)) {
                    return response.readEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }


    /**
     * Workaround for JAX_RS_SPEC-312
     * 
     */
    private static class WebApplicationExceptionMessage
        extends WebApplicationException
    {


        private WebApplicationExceptionMessage(Response response) {
            super(response);
        }

        /**
         * Workaround for JAX_RS_SPEC-312
         * 
         */
        public String getMessage() {
            Response response = getResponse();
            Response.Status status = Response.Status.fromStatusCode(response.getStatus());
            if (status!= null) {
                return (response.getStatus()+(" "+ status.getReasonPhrase()));
            } else {
                return Integer.toString(response.getStatus());
            }
        }

        public String toString() {
            String s = "javax.ws.rs.WebApplicationException";
            String message = getLocalizedMessage();
            return (s +(": "+ message));
        }

    }

}
