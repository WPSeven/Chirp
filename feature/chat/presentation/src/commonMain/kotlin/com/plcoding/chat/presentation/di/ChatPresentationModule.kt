package com.plcoding.chat.presentation.di

import com.plcoding.chat.presentation.chat_detail.ChatDetailViewModel
import com.plcoding.chat.presentation.chat_list.ChatListViewModel
import com.plcoding.chat.presentation.chat_list_detail.ChatListDetailViewModel
import com.plcoding.chat.presentation.create_chat.CreateChatViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val chatPresentationModule = module {
    viewModelOf(::ChatListViewModel)
    viewModelOf(::ChatListDetailViewModel)
    viewModelOf(::CreateChatViewModel)
    viewModelOf(::ChatDetailViewModel)
}