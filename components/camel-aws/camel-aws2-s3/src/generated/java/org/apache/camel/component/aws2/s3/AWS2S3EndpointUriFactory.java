/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.s3;

import javax.annotation.processing.Generated;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateEndpointUriFactoryMojo")
public class AWS2S3EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = "://bucketNameOrArn";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(78);
        props.add("accessKey");
        props.add("amazonS3Client");
        props.add("amazonS3Presigner");
        props.add("autoCreateBucket");
        props.add("autocloseBody");
        props.add("awsKMSKeyId");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("batchMessageNumber");
        props.add("batchSize");
        props.add("bridgeErrorHandler");
        props.add("bucketNameOrArn");
        props.add("bufferSize");
        props.add("conditionalWritesEnabled");
        props.add("customerAlgorithm");
        props.add("customerKeyId");
        props.add("customerKeyMD5");
        props.add("delay");
        props.add("deleteAfterRead");
        props.add("deleteAfterWrite");
        props.add("delimiter");
        props.add("destinationBucket");
        props.add("destinationBucketPrefix");
        props.add("destinationBucketSuffix");
        props.add("doneFileName");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("fileName");
        props.add("forcePathStyle");
        props.add("greedy");
        props.add("ignoreBody");
        props.add("inProgressRepository");
        props.add("includeBody");
        props.add("includeFolders");
        props.add("initialDelay");
        props.add("keyName");
        props.add("lazyStartProducer");
        props.add("maxConnections");
        props.add("maxMessagesPerPoll");
        props.add("moveAfterRead");
        props.add("multiPartUpload");
        props.add("namingStrategy");
        props.add("operation");
        props.add("overrideEndpoint");
        props.add("partSize");
        props.add("pojoRequest");
        props.add("policy");
        props.add("pollStrategy");
        props.add("prefix");
        props.add("profileCredentialsName");
        props.add("proxyHost");
        props.add("proxyPort");
        props.add("proxyProtocol");
        props.add("region");
        props.add("repeatCount");
        props.add("restartingPolicy");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("secretKey");
        props.add("sendEmptyMessageWhenIdle");
        props.add("sessionToken");
        props.add("startScheduler");
        props.add("storageClass");
        props.add("streamingUploadMode");
        props.add("streamingUploadTimeout");
        props.add("timeUnit");
        props.add("trustAllCertificates");
        props.add("uriEndpointOverride");
        props.add("useAwsKMS");
        props.add("useCustomerKey");
        props.add("useDefaultCredentialsProvider");
        props.add("useFixedDelay");
        props.add("useProfileCredentialsProvider");
        props.add("useSSES3");
        props.add("useSessionCredentials");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("accessKey");
        secretProps.add("secretKey");
        secretProps.add("sessionToken");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "aws2-s3".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "bucketNameOrArn", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

