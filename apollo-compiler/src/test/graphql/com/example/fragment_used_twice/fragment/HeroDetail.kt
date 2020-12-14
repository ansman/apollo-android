// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_used_twice.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMapper
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import com.apollographql.apollo.api.internal.ResponseReader
import com.example.fragment_used_twice.fragment.adapter.HeroDetailsImpl_ResponseAdapter
import kotlin.Any
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
interface HeroDetail : GraphqlFragment {
  val __typename: String

  /**
   * The name of the character
   */
  val name: String

  interface Character : HeroDetail, CharacterDetail {
    override val __typename: String

    /**
     * The name of the character
     */
    override val name: String

    /**
     * The date character was born.
     */
    override val birthDate: Any

    override fun marshaller(): ResponseFieldMarshaller
  }

  companion object {
    operator fun invoke(reader: ResponseReader): HeroDetail {
      return HeroDetailsImpl_ResponseAdapter.fromResponse(reader)
    }

    fun Mapper(): ResponseFieldMapper<HeroDetail> {
      return ResponseFieldMapper { reader ->
        HeroDetailsImpl_ResponseAdapter.fromResponse(reader)
      }
    }

    fun HeroDetail.characterDetails(): CharacterDetail? = this as? CharacterDetail

    fun HeroDetail.asCharacter(): Character? = this as? Character
  }
}
