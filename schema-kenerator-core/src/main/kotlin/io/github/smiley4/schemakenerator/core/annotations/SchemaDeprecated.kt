package io.github.smiley4.schemakenerator.core.annotations

 @Target(
     AnnotationTarget.CLASS,
     AnnotationTarget.PROPERTY,
     AnnotationTarget.FIELD,
     AnnotationTarget.FUNCTION
 )
 @Retention(AnnotationRetention.RUNTIME)
annotation class SchemaDeprecated(val deprecated: Boolean = true)
