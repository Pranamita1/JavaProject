
var app=angular.module("myApp" , ['ngRoute', 'ngCookies']);
app.config(function($routeProvider){
	$routeProvider
		.when('/' , {
			controller: 'LoginController',
	        templateUrl: 'User/Login.html',
	        
		})
		
		.when('/login' , {
			controller: 'LoginController',
	        templateUrl: 'User/loginRegistration.html',
	        controllerAs: 'vm'
		})
		
		 .when('/home',{
			 templateUrl: 'home/home.html'
		 })
		 
		 .when('/logout',{
			 templateUrl: 'User/Login.html',
		 })
		 
		 .when('/blog' , {
			controller: 'BlogController',
	        templateUrl: 'Blog/Blog.html',
	       // controllerAs: 'ctrl'
		})
		
				.when('/forum' , {
			controller: 'ForumController',
	        templateUrl: 'Forum/forum.html'
	       // controllerAs: 'ctrl'
		})
		
		.when('/event' , {
			controller: 'EventController',
	        templateUrl: 'Event/event.html'
	       // controllerAs: 'ctrl'
		})
		
		.when('/chat', {

		templateUrl : 'Chat/chat.html',
		controller : 'ChatController',

	})
		
		.otherwise({redirectTo : '/'})
		
		
});
app.run(function($rootScope, $cookieStore, $location, $http){
	$rootScope.currentUser = $cookieStore.get('currentUser');
	if(!$rootScope.currentUser){
		$location.path('/');
	}else{
		$location.path('/home');
	}
});

 
 