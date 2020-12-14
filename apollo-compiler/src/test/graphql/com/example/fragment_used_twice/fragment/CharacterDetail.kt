// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_used_twice.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseReader
import com.example.fragment_used_twice.fragment.adapter.CharacterDetailsImpl_ResponseAdapter
import kotlin.Any
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
interface CharacterDetail : GraphqlFragment {
  val __typename: String

  /**
   * The name of the character
   */
  val name: String

  /**
   * The date character was born.
   */
  val birthDate: Any

  companion object {
    operator fun invoke(reader: ResponseReader): CharacterDetail {
      return CharacterDetailsImpl_ResponseAdapter.fromResponse(reader)
    }

    fun Mapper(): ResponseFieldMapper<CharacterDetail> {
      return ResponseFieldMapper { reader ->
        CharacterDetailsImpl_ResponseAdapter.fromResponse(reader)
      }
    }
  }
}
