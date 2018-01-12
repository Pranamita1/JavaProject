app.controller('EventController',[
				'EventService',
				'$http',
				'$scope',
				'$rootScope',
				'$location',
				'$cookieStore',
				function(EventService,$http, $scope,$rootScope,$location,$cookieStore){
					var self = this;
					self.forum = {};
					self.forums = {};
					self.myforums = {};
					self.addForum = function(){
						self.forum.users = $rootScope.currentUser;
						EventService.addForum(self.forum).then(function(response){
							//self.forum = response;
							$location.path("/event");
						},function(error){
							alert("Error");
						});
					}
					
					self.forumList = function(){
						//self.blogs = $rootScope.currentUser;
						EventService.getAllBlog().then(function(response){
							console.log("in side controller");
							self.forums = response;
							
							 
						},
						function(errors){
							alert("Error");
						});
					}
					
					self.myForumList = function(){
						self.buId = $cookieStore.get('currentUser').userId;
						EventService.getMyForum(self.buId).then(function(response){
							self.myforums = response;
						},function(error){
							alert("Error getting data");
						});
					}
					
					self.updateForumById = function(id){
						EventService.setForumById(id).then(function(d){
								//sself.myBlogList;
							self.forum = d;
							 //$location.path("/blog"); 
						},function(error){
							alert("Error");
						})
					}
					
					self.deleteForum = function(buId){
						 self.delForum = $cookieStore.get('currentUser').userId;
						 EventService.deleteBlog(buId).then(
								self.myForumList,
								function(error){
									alert("can not be deleted");
								})
					}
					
					self.approveForum = function(id){
						EventService.approveBlog(id).then(
								self.forumList,function(error){
									alert("Sorry...Error in Approving the Blog");
								});
					}
					
					
					 
				}
])