angular.module('ficovie')
  .directive('header', function () {
    return {
        restrict: 'E', 
        replace: true,
        scope: {user: '='}, // This is one of the cool things :). Will be explained in post.
        templateUrl: "/components/header/header.html",
        controller: ['$scope', '$filter', function ($scope, $filter) {
            // Your behaviour goes here :)
        }]
    }
});
