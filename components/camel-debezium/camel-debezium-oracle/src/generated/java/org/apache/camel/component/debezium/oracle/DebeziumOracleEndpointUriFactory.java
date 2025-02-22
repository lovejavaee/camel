/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium.oracle;

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
public class DebeziumOracleEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(129);
        props.add("additionalProperties");
        props.add("archiveDestinationName");
        props.add("archiveLogHours");
        props.add("binaryHandlingMode");
        props.add("bridgeErrorHandler");
        props.add("columnExcludeList");
        props.add("columnIncludeList");
        props.add("columnPropagateSourceType");
        props.add("converters");
        props.add("customMetricTags");
        props.add("databaseConnectionAdapter");
        props.add("databaseDbname");
        props.add("databaseHostname");
        props.add("databaseOutServerName");
        props.add("databasePassword");
        props.add("databasePdbName");
        props.add("databasePort");
        props.add("databaseQueryTimeoutMs");
        props.add("databaseUrl");
        props.add("databaseUser");
        props.add("datatypePropagateSourceType");
        props.add("decimalHandlingMode");
        props.add("errorsMaxRetries");
        props.add("eventProcessingFailureHandlingMode");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("heartbeatActionQuery");
        props.add("heartbeatIntervalMs");
        props.add("heartbeatTopicsPrefix");
        props.add("includeSchemaChanges");
        props.add("includeSchemaComments");
        props.add("incrementalSnapshotWatermarkingStrategy");
        props.add("internalKeyConverter");
        props.add("internalValueConverter");
        props.add("intervalHandlingMode");
        props.add("lobEnabled");
        props.add("logMiningArchiveLogOnlyMode");
        props.add("logMiningArchiveLogOnlyScnPollIntervalMs");
        props.add("logMiningBatchSizeDefault");
        props.add("logMiningBatchSizeMax");
        props.add("logMiningBatchSizeMin");
        props.add("logMiningBufferDropOnStop");
        props.add("logMiningBufferEhcacheEventsConfig");
        props.add("logMiningBufferEhcacheGlobalConfig");
        props.add("logMiningBufferEhcacheProcessedtransactionsConfig");
        props.add("logMiningBufferEhcacheSchemachangesConfig");
        props.add("logMiningBufferEhcacheTransactionsConfig");
        props.add("logMiningBufferInfinispanCacheEvents");
        props.add("logMiningBufferInfinispanCacheGlobal");
        props.add("logMiningBufferInfinispanCacheProcessedTransactions");
        props.add("logMiningBufferInfinispanCacheSchemaChanges");
        props.add("logMiningBufferInfinispanCacheTransactions");
        props.add("logMiningBufferTransactionEventsThreshold");
        props.add("logMiningBufferType");
        props.add("logMiningFlushTableName");
        props.add("logMiningIncludeRedoSql");
        props.add("logMiningQueryFilterMode");
        props.add("logMiningRestartConnection");
        props.add("logMiningScnGapDetectionGapSizeMin");
        props.add("logMiningScnGapDetectionTimeIntervalMaxMs");
        props.add("logMiningSessionMaxMs");
        props.add("logMiningSleepTimeDefaultMs");
        props.add("logMiningSleepTimeIncrementMs");
        props.add("logMiningSleepTimeMaxMs");
        props.add("logMiningSleepTimeMinMs");
        props.add("logMiningStrategy");
        props.add("logMiningTransactionRetentionMs");
        props.add("logMiningUsernameExcludeList");
        props.add("logMiningUsernameIncludeList");
        props.add("maxBatchSize");
        props.add("maxQueueSize");
        props.add("maxQueueSizeInBytes");
        props.add("messageKeyColumns");
        props.add("name");
        props.add("notificationEnabledChannels");
        props.add("notificationSinkTopicName");
        props.add("offsetCommitPolicy");
        props.add("offsetCommitTimeoutMs");
        props.add("offsetFlushIntervalMs");
        props.add("offsetStorage");
        props.add("offsetStorageFileName");
        props.add("offsetStoragePartitions");
        props.add("offsetStorageReplicationFactor");
        props.add("offsetStorageTopic");
        props.add("openlogreplicatorHost");
        props.add("openlogreplicatorPort");
        props.add("openlogreplicatorSource");
        props.add("pollIntervalMs");
        props.add("postProcessors");
        props.add("provideTransactionMetadata");
        props.add("queryFetchSize");
        props.add("racNodes");
        props.add("retriableRestartConnectorWaitMs");
        props.add("schemaHistoryInternal");
        props.add("schemaHistoryInternalFileFilename");
        props.add("schemaHistoryInternalSkipUnparseableDdl");
        props.add("schemaHistoryInternalStoreOnlyCapturedDatabasesDdl");
        props.add("schemaHistoryInternalStoreOnlyCapturedTablesDdl");
        props.add("schemaNameAdjustmentMode");
        props.add("signalDataCollection");
        props.add("signalEnabledChannels");
        props.add("signalPollIntervalMs");
        props.add("skippedOperations");
        props.add("snapshotDatabaseErrorsMaxRetries");
        props.add("snapshotDelayMs");
        props.add("snapshotFetchSize");
        props.add("snapshotIncludeCollectionList");
        props.add("snapshotLockTimeoutMs");
        props.add("snapshotLockingMode");
        props.add("snapshotMaxThreads");
        props.add("snapshotMode");
        props.add("snapshotModeConfigurationBasedSnapshotData");
        props.add("snapshotModeConfigurationBasedSnapshotOnDataError");
        props.add("snapshotModeConfigurationBasedSnapshotOnSchemaError");
        props.add("snapshotModeConfigurationBasedSnapshotSchema");
        props.add("snapshotModeConfigurationBasedStartStream");
        props.add("snapshotModeCustomName");
        props.add("snapshotSelectStatementOverrides");
        props.add("snapshotTablesOrderByRowCount");
        props.add("sourceinfoStructMaker");
        props.add("streamingDelayMs");
        props.add("tableExcludeList");
        props.add("tableIncludeList");
        props.add("timePrecisionMode");
        props.add("tombstonesOnDelete");
        props.add("topicNamingStrategy");
        props.add("topicPrefix");
        props.add("transactionMetadataFactory");
        props.add("unavailableValuePlaceholder");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("additionalProperties.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "debezium-oracle".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
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

