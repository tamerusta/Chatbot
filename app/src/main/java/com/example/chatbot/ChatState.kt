package com.example.chatbot

import android.graphics.Bitmap
import com.example.chatbot.data.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap ?= null
)
