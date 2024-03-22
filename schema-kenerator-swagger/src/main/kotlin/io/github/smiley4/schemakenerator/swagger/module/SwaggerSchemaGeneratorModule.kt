package io.github.smiley4.schemakenerator.swagger.module

import io.github.smiley4.schemakenerator.core.parser.BaseTypeData
import io.github.smiley4.schemakenerator.core.parser.TypeParserContext
import io.github.smiley4.schemakenerator.swagger.SwaggerSchemaGenerator
import io.swagger.v3.oas.models.media.Schema

interface SwaggerSchemaGeneratorModule {
    fun build(generator: SwaggerSchemaGenerator, context: TypeParserContext, typeData: BaseTypeData): Schema<*>?
    fun enhance(generator: SwaggerSchemaGenerator, context: TypeParserContext, typeData: BaseTypeData, node: Schema<*>)
}