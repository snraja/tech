//
//  HomeViewModel.swift
//  News
//
//  Created by Narasimha Raja on 02/12/19.
//  Copyright © 2019 snraja. All rights reserved.
//

import Foundation

class HomeViewModel<Model : HomeModel> : BaseViewModel<BaseModel>
{
    var model : Model
    var news : String?
    
    override init() {
        model = Model()
        super.init()
        model.delegate = self
    }
    
    func fetchNews()
    {
        // fetches news from a real web service
        let deadline = DispatchTime.now() + .seconds(2)
        DispatchQueue.main.asyncAfter(deadline: deadline) {
            self.model.news = "Hello NEWS"
            self.news = self.model.news
            self.delegate?.notifyViewModelUpdate(update: "FetchedNews")
        }
    }
}
