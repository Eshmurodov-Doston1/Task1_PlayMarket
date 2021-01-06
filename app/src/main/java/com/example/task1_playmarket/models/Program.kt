package com.example.task1_playmarket.models

class Program {
    var imgUrl:String?=null
    var appName:String?=null
    var skachat:String?=null

    constructor(imgUrl: String, appName: String,skachat:String) {
        this.imgUrl = imgUrl
        this.appName = appName
        this.skachat =skachat
    }
}