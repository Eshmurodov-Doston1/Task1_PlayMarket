package com.example.task1_playmarket.models

class ClassIdList {
    var title:String?=null
    var appList:List<Program>?=null

    constructor(title: String, appList: List<Program>) {
        this.title = title
        this.appList = appList
    }
}