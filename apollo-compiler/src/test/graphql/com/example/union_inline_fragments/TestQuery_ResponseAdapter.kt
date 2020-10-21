// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.union_inline_fragments

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.union_inline_fragments.type.CustomType
import com.example.union_inline_fragments.type.Episode
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forList("search", "search", mapOf<String, Any>(
      "text" to "test"), true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var search: List<TestQuery.Search?>? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> search = readList<TestQuery.Search>(RESPONSE_FIELDS[0]) { reader ->
            reader.readObject<TestQuery.Search> { reader ->
              TestQuery_ResponseAdapter.Search_ResponseAdapter.fromResponse(reader)
            }
          }
          else -> break
        }
      }
      TestQuery.Data(
        search = search
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: TestQuery.Data) {
    writer.writeList(RESPONSE_FIELDS[0], value.search) { value, listItemWriter ->
      value?.forEach { value ->
        if(value == null) {
          listItemWriter.writeObject(null)
        } else {
          listItemWriter.writeObject {
            TestQuery_ResponseAdapter.Search_ResponseAdapter.toResponse(writer, value)
          }
        }
      }
    }
  }

  object Friend1_ResponseAdapter : ResponseAdapter<TestQuery.Friend1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forEnum("firstAppearsIn", "firstAppearsIn", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Friend1 {
      return reader.run {
        var __typename: String? = __typename
        var firstAppearsIn: Episode? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> firstAppearsIn = readString(RESPONSE_FIELDS[1])?.let { Episode.safeValueOf(it) }
            else -> break
          }
        }
        TestQuery.Friend1(
          __typename = __typename!!,
          firstAppearsIn = firstAppearsIn!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Friend1) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.firstAppearsIn.rawValue)
    }
  }

  object Human_ResponseAdapter : ResponseAdapter<TestQuery.Human> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("homePlanet", "homePlanet", null, true, null),
      ResponseField.forList("friends", "friends", null, true, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Human {
      return reader.run {
        var __typename: String? = __typename
        var homePlanet: String? = null
        var friends: List<TestQuery.Friend1?>? = null
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> homePlanet = readString(RESPONSE_FIELDS[1])
            2 -> friends = readList<TestQuery.Friend1>(RESPONSE_FIELDS[2]) { reader ->
              reader.readObject<TestQuery.Friend1> { reader ->
                TestQuery_ResponseAdapter.Friend1_ResponseAdapter.fromResponse(reader)
              }
            }
            3 -> name = readString(RESPONSE_FIELDS[3])
            else -> break
          }
        }
        TestQuery.Human(
          __typename = __typename!!,
          homePlanet = homePlanet,
          friends = friends,
          name = name!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Human) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.homePlanet)
      writer.writeList(RESPONSE_FIELDS[2], value.friends) { value, listItemWriter ->
        value?.forEach { value ->
          if(value == null) {
            listItemWriter.writeObject(null)
          } else {
            listItemWriter.writeObject {
              TestQuery_ResponseAdapter.Friend1_ResponseAdapter.toResponse(writer, value)
            }
          }
        }
      }
      writer.writeString(RESPONSE_FIELDS[3], value.name)
    }
  }

  object Friend2_ResponseAdapter : ResponseAdapter<TestQuery.Friend2> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forCustomType("id", "id", null, false, CustomType.ID, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Friend2 {
      return reader.run {
        var __typename: String? = __typename
        var id: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> id = readCustomType<String>(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField)
            else -> break
          }
        }
        TestQuery.Friend2(
          __typename = __typename!!,
          id = id!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Friend2) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeCustom(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField, value.id)
    }
  }

  object Droid_ResponseAdapter : ResponseAdapter<TestQuery.Droid> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("primaryFunction", "primaryFunction", null, true, null),
      ResponseField.forList("friends", "friends", null, true, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Droid {
      return reader.run {
        var __typename: String? = __typename
        var primaryFunction: String? = null
        var friends: List<TestQuery.Friend2?>? = null
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> primaryFunction = readString(RESPONSE_FIELDS[1])
            2 -> friends = readList<TestQuery.Friend2>(RESPONSE_FIELDS[2]) { reader ->
              reader.readObject<TestQuery.Friend2> { reader ->
                TestQuery_ResponseAdapter.Friend2_ResponseAdapter.fromResponse(reader)
              }
            }
            3 -> name = readString(RESPONSE_FIELDS[3])
            else -> break
          }
        }
        TestQuery.Droid(
          __typename = __typename!!,
          primaryFunction = primaryFunction,
          friends = friends,
          name = name!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Droid) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.primaryFunction)
      writer.writeList(RESPONSE_FIELDS[2], value.friends) { value, listItemWriter ->
        value?.forEach { value ->
          if(value == null) {
            listItemWriter.writeObject(null)
          } else {
            listItemWriter.writeObject {
              TestQuery_ResponseAdapter.Friend2_ResponseAdapter.toResponse(writer, value)
            }
          }
        }
      }
      writer.writeString(RESPONSE_FIELDS[3], value.name)
    }
  }

  object OtherFriend_ResponseAdapter : ResponseAdapter<TestQuery.OtherFriend> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.OtherFriend {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        TestQuery.OtherFriend(
          __typename = __typename!!,
          name = name!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.OtherFriend) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
    }
  }

  object Friend_ResponseAdapter : ResponseAdapter<TestQuery.Friend> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Friend {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Human" -> TestQuery_ResponseAdapter.Human_ResponseAdapter.fromResponse(reader, typename)
        "Droid" -> TestQuery_ResponseAdapter.Droid_ResponseAdapter.fromResponse(reader, typename)
        else -> TestQuery_ResponseAdapter.OtherFriend_ResponseAdapter.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Friend) {
      when(value) {
        is TestQuery.Human -> TestQuery_ResponseAdapter.Human_ResponseAdapter.toResponse(writer, value)
        is TestQuery.Droid -> TestQuery_ResponseAdapter.Droid_ResponseAdapter.toResponse(writer, value)
        is TestQuery.OtherFriend -> TestQuery_ResponseAdapter.OtherFriend_ResponseAdapter.toResponse(writer, value)
      }
    }
  }

  object Character_ResponseAdapter : ResponseAdapter<TestQuery.Character> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forCustomType("id", "id", null, false, CustomType.ID, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forList("friends", "friends", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Character {
      return reader.run {
        var __typename: String? = __typename
        var id: String? = null
        var name: String? = null
        var friends: List<TestQuery.Friend?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> id = readCustomType<String>(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField)
            2 -> name = readString(RESPONSE_FIELDS[2])
            3 -> friends = readList<TestQuery.Friend>(RESPONSE_FIELDS[3]) { reader ->
              reader.readObject<TestQuery.Friend> { reader ->
                TestQuery_ResponseAdapter.Friend_ResponseAdapter.fromResponse(reader)
              }
            }
            else -> break
          }
        }
        TestQuery.Character(
          __typename = __typename!!,
          id = id!!,
          name = name!!,
          friends = friends
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Character) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeCustom(RESPONSE_FIELDS[1] as ResponseField.CustomTypeField, value.id)
      writer.writeString(RESPONSE_FIELDS[2], value.name)
      writer.writeList(RESPONSE_FIELDS[3], value.friends) { value, listItemWriter ->
        value?.forEach { value ->
          if(value == null) {
            listItemWriter.writeObject(null)
          } else {
            listItemWriter.writeObject {
              TestQuery_ResponseAdapter.Friend_ResponseAdapter.toResponse(writer, value)
            }
          }
        }
      }
    }
  }

  object Starship_ResponseAdapter : ResponseAdapter<TestQuery.Starship> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Starship {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        TestQuery.Starship(
          __typename = __typename!!,
          name = name!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Starship) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
    }
  }

  object OtherSearch_ResponseAdapter : ResponseAdapter<TestQuery.OtherSearch> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.OtherSearch {
      return reader.run {
        var __typename: String? = __typename
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            else -> break
          }
        }
        TestQuery.OtherSearch(
          __typename = __typename!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.OtherSearch) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
    }
  }

  object Search_ResponseAdapter : ResponseAdapter<TestQuery.Search> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Search {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Droid" -> TestQuery_ResponseAdapter.Character_ResponseAdapter.fromResponse(reader, typename)
        "Human" -> TestQuery_ResponseAdapter.Character_ResponseAdapter.fromResponse(reader, typename)
        "Starship" -> TestQuery_ResponseAdapter.Starship_ResponseAdapter.fromResponse(reader, typename)
        else -> TestQuery_ResponseAdapter.OtherSearch_ResponseAdapter.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Search) {
      when(value) {
        is TestQuery.Character -> TestQuery_ResponseAdapter.Character_ResponseAdapter.toResponse(writer, value)
        is TestQuery.Character -> TestQuery_ResponseAdapter.Character_ResponseAdapter.toResponse(writer, value)
        is TestQuery.Starship -> TestQuery_ResponseAdapter.Starship_ResponseAdapter.toResponse(writer, value)
        is TestQuery.OtherSearch -> TestQuery_ResponseAdapter.OtherSearch_ResponseAdapter.toResponse(writer, value)
      }
    }
  }
}