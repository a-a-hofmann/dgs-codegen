package kotlin2.interfaceClassWithInterfaceFieldsOfDifferentType.expected.types

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.String

@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__typename"
)
@JsonSubTypes(value = [
  JsonSubTypes.Type(value = Dog::class, name = "Dog")
])
public sealed interface Pet {
  public val name: String?

  public val diet: Diet?
}