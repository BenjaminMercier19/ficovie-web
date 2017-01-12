angular.module('ficovie')
  .directive('sidebar', function () {
    return {
        restrict: 'E',
        replace: true,
        scope: {}, // This is one of the cool things :). Will be explained in post.
        templateUrl: "/components/sidebar/sidebar.html",
        controller: ['$scope', '$filter', function ($scope, $filter) {
            // Your behaviour goes here :)
        }]
    }
});
