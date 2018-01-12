app.service('ForumService',[
	         '$http',
	         '$q',
	         '$rootScope',
	         function($http, $q, $rootScope){
	        	 this.addForum = function(forum){
	        		 var defer = $q.defer();
	        		 $http.post('http://localhost:9002/Collaboration_Back/addforum' , forum).then(function(response){
	        			 defer.resolve(response.data);
	        		 },function(error){
	        			 defer.reject();
	        		 });
	        		 return defer.promise;
	        	 }
	        	 
	        	 this.getAllBlog = function(){
						var deferred = $q.defer();
						$http.get('http://localhost:9002/Collaboration_Back/getforum').then(function(response){
							console.log("inside service");
							deferred.resolve(response.data);
						},
						function(error){
							deferred.reject();
						});
						return deferred.promise;
					}
	        	 
	        	 this.getMyForum = function(buId){
						var defer = $q.defer();
						$http.get('http://localhost:9002/Collaboration_Back/myForum/' + buId).then(function(response){
							defer.resolve(response.data);
						},function(error){
							defer.reject();
						});
						return defer.promise;
					}
	        	 
	        	 this.setForumById = function(id){
						var defer = $q.defer();
						$http.get('http://localhost:9002/Collaboration_Back/oneforum/' + id).then(function(response){
							defer.resolve(response.data);
						},function(error){
							defer.reject();
						});
						return defer.promise;
					}
					
	        	 this.deleteBlog  = function(buId){
						var defer = $q.defer();
						$http.post('http://localhost:9002/Collaboration_Back/deleteforum/' + buId).then(function(response){
							defer.resolve(response.data);
						},function(error){
							defer.reject();
						});
						return defer.promise;
					}
	        	 
	        	 this.approveBlog = function(id){
						var defer = $q.defer();
						$http.post('http://localhost:9002/Collaboration_Back/approveforum/' + id).then(function(response){
							defer.resolve(response.data);
						},
						function(error){
							defer.reject();
						});
						return defer.promise;
					}
					
					
	        	 
	         }
])