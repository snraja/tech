//
//  AppDelegate.swift
//  Weather
//
//  Created by Narasimha Raja on 12/11/19.
//  Copyright © 2019 Narasimha Raja. All rights reserved.
//

import UIKit

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {
    var window: UIWindow?
    
    var homeController : HomeController<HomeView, HomeModel>

    override init() {
        self.homeController = HomeController()
        super.init()
    }
    
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        
        window = UIWindow(frame: UIScreen.main.bounds)
        
        let navigationController = UINavigationController(rootViewController: homeController.view)
        window?.rootViewController = navigationController
        window?.makeKeyAndVisible()
        return true
    }

}
