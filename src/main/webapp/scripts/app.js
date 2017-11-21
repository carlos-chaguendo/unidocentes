angular.module('ngdemoApp.controllers', []);

angular.module("ngdemoApp", ['ngRoute','ngdemoApp.controllers' ])
.config(['$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {
	  
	  
	  $locationProvider.hashPrefix('!');
//	  programa-list de donde viene
		$routeProvider.
		//microcurriculos
//		when('/materia1', {templateUrl: 'views/Microcurriculos.html', controller: 'MicrocurriculoListCtrl'}).
//		when('/materia1', {templateUrl: 'views/Microcurriculos.html', controller: 'MicrocurriculoListCtrl'}).
//		
//		when('/programa-creation', {templateUrl: 'views/programa-creation.html', controller: 'ProgramaCreationCtrl'}).
//		when('/programa-details', {templateUrl: 'views/programa-details.html', controller: 'ProgramaListCtrl'}).
//		when('/universidad-create', {templateUrl: 'views/universidad-create.html', controller: 'UniversidadCreateCtrl'}).
//		when('/universidad-list', {templateUrl: 'views/universidad-list.html', controller: 'UniversidadListCtrl'}).
//		when('/universidad-detail/:idP/:idD/:idC', {templateUrl: 'views/universidad-detail.html', controller: 'UniversidadDetailCtrl'}).
//		when('/universidad-view/:idP/:idD/:idC', {templateUrl: 'views/universidad-view.html', controller: 'UniversidadDetailCtrl'}).
//		when('/microcurriculo-view', {templateUrl: 'views/Microcurriculos.html', controller: 'MicrocurriculoListCtrl'}).
//		
		when('/main', {templateUrl: 'views/micro-curriculos.html',controller:'MicroCurriculosCtrl'}).

		
		otherwise('/main');
		
	  //$locationProvider.hashPrefix('');
	  
	  /* CORS... */
	  /* http://stackoverflow.com/questions/17289195/angularjs-post-data-to-external-rest-api */
	  /*$httpProvider.defaults.useXDomain = true;
	  delete $httpProvider.defaults.headers.common['X-Requested-With'];*/
}]);

