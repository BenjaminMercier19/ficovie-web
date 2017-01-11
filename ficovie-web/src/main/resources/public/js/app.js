'use strict';

// Declare app level module which depends on views, and components
angular.module('ficovie', [
  'ngRoute',
  'ui.bootstrap',
  //'ficovie.bootstrap',
  'ficovie.customer'])
  .config(['$locationProvider', '$httpProvider', function($locationProvider, $httpProvider) {
    $locationProvider.hashPrefix('!');
    /*$httpProvider.defaults.useXDomain = true;
    delete $httpProvider.defaults.headers.common['X-Requested-With'];*/
  }])
