package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

//las clases sealed son clases selladas o cerradas. Representan clases restrictas en jerarquia (?)
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
