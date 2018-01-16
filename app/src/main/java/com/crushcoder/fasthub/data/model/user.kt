package com.crushcoder.fasthub.data.model


data class User(
        var login: String,
        var id: Number,
        var avatar_url: String,
        var gravatar_id: String,
        var url: String,
        var html_url: String,
        var followers_url: String,
        var following_url: String,
        var gists_url: String,
        var starred_url: String,
        var subscriptions_url: String,
        var organizations_url: String,
        var repos_url: String,
        var name: String,
        var company: String,
        var blog: String,
        var location: String,
        var email: String,
        var bio: String,
        var public_repos: Number,
        var followers: Number,
        var following: Number)


