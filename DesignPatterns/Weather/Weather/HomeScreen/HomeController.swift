//
//  HomeController.swift
//  DP
//
//  Created by Narasimha Raja on 08/11/19.
//  Copyright © 2019 Narasimha Raja. All rights reserved.
//

import Foundation
import UIKit

class HomeController<HView : HomeView, HModel : HomeModel> : BaseController<HomeView, HomeModel>
{
    public let view : HView
    public let model : HModel

    override init() {
        print("HomeController init begin")
        let storyBoard = UIStoryboard(name: "Main", bundle: nil)
        self.view = storyBoard.instantiateViewController(withIdentifier: "HomeView") as! HView
        self.model = HModel()
        print("HomeController before super init begin")
        super.init()
        print("HomeController after superinit begin")
        self.view.viewActionDelegate = self;
        self.model.modelDelegate = self;
        super.updateViewDelegate = view
        super.updateModelDelegate = model
        print("HomeController init end")
    }
    
}
