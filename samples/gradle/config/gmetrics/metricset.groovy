metricset {

    description 'A sample MetricSet'

    metric(org.gmetrics.metric.abc.AbcMetric) {
        functions = ['average', 'maximum', 'minimum', 'total']
    }

    metric(org.gmetrics.metric.cyclomatic.CyclomaticComplexityMetric) {
        functions = ['average', 'maximum', 'minimum', 'total']
    }

    metric(org.gmetrics.metric.linecount.MethodLineCountMetric) {
        functions = ['average', 'maximum', 'minimum', 'total']
    }

    metric(org.gmetrics.metric.linecount.ClassLineCountMetric) {
        functions = ['average', 'maximum', 'minimum', 'total']
    }
}
