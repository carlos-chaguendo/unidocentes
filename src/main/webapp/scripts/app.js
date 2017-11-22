angular.module('unidocentesApp.controllers', []);
angular.module('unidocentesApp.services', []);

/**
 * Se crea la alplicacion con un nombre y un arreglo de todos los modulos |
 * Dependencia s que esta necesita
 */
var app = angular.module("unidocentesApp", [ 'ui.router',
		'unidocentesApp.controllers', 'unidocentesApp.services' ]);

/**
 * Configuracion general del la aplicacion La rutas pueden configurarse por
 * modulos y submodulos
 */
app.config([ '$stateProvider', '$urlRouterProvider',
		function($stateProvider, $urlRouterProvider) {

			$urlRouterProvider.otherwise('/');

			$stateProvider.state('root', {
				url : '/',
				controller : [ '$state', '$scope', function($state, $scope) {

					$scope.currentUser = {
						username : 'silvia.anacona',
						name : 'Silvia Alejandra Anacona'
					}

					/*
					 * Se debe verificar si el usario esta logeado se regirige a
					 * home Encaso contrario hay que pedir un usuario y
					 * contrasenia
					 */

					if ($state.current.name == 'root') {
						$state.go('root.home', {
							'currentUserName' : $scope.currentUser.username
						})
					}
				} ],
				templateUrl : "views/index-logeado.html",
				data : {
					title : "larr"
				}
			}).state('root.home', {
				url : ':currentUserName',
				data : {
					title : "Home"
				},
				views : {
					'menu' : {
						templateUrl : 'views/menu/menu.html'
					},
					'root' : {
						templateUrl : 'views/menu/bienvenida.html'
					}
				}
			})

			/*
			 * Configurasion especifica de las rutas por modulos
			 */
			$stateProvider.state('root.home.microcurriculos', {
				url : '/microcurriculos',
				templateUrl : 'views/microcurriculos/listado.html',
				data : {
					title : "Materia / Microcurriculos"
				}
			}).state('root.home.microcurriculos.nuevo', {
				url : '/nuevo',
				templateUrl : 'views/microcurriculos/nuevo.html',
				controller : 'MicrocurriculoNuevoCtrl',
				data : {
					title : "Materia / Microcurriculos / Nuevo"
				}
			})

			/*
			 * Configurasion especifica de las rutas
			 */
			$stateProvider.state('root.home.asistencia', {
				url : '/asistencia-docente',
				templateUrl : 'views/asistencia/listado.html',
				data : {
					title : "Materia / Asistencia Docente"
				},
			})

		} ]);

/**
 * Configuracion inical de arranque de la aplicacion
 */
app.run([ '$rootScope', '$state', '$stateParams',
		function($rootScope, $state, stateParams) {
			$rootScope.$_state = $state
		} ])
