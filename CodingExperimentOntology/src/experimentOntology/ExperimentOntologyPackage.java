/**
 */
package experimentOntology;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see experimentOntology.ExperimentOntologyFactory
 * @model kind="package"
 * @generated
 */
public interface ExperimentOntologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "experimentOntology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/experimentOntology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "experimentOntology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExperimentOntologyPackage eINSTANCE = experimentOntology.impl.ExperimentOntologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link experimentOntology.impl.ExperimentalStudyImpl <em>Experimental Study</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.impl.ExperimentalStudyImpl
	 * @see experimentOntology.impl.ExperimentOntologyPackageImpl#getExperimentalStudy()
	 * @generated
	 */
	int EXPERIMENTAL_STUDY = 0;

	/**
	 * The feature id for the '<em><b>Experiments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_STUDY__EXPERIMENTS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_STUDY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Experimental Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_STUDY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Experimental Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_STUDY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.impl.ExperimentImpl <em>Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.impl.ExperimentImpl
	 * @see experimentOntology.impl.ExperimentOntologyPackageImpl#getExperiment()
	 * @generated
	 */
	int EXPERIMENT = 1;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__PLAN = 0;

	/**
	 * The feature id for the '<em><b>Execution Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__EXECUTION_PLAN = 1;

	/**
	 * The number of structural features of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.impl.ReplicationImpl <em>Replication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.impl.ReplicationImpl
	 * @see experimentOntology.impl.ExperimentOntologyPackageImpl#getReplication()
	 * @generated
	 */
	int REPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION__PLAN = EXPERIMENT__PLAN;

	/**
	 * The feature id for the '<em><b>Execution Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION__EXECUTION_PLAN = EXPERIMENT__EXECUTION_PLAN;

	/**
	 * The feature id for the '<em><b>Original</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION__ORIGINAL = EXPERIMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Replication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_FEATURE_COUNT = EXPERIMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Replication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_OPERATION_COUNT = EXPERIMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link experimentOntology.ExperimentalStudy <em>Experimental Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Study</em>'.
	 * @see experimentOntology.ExperimentalStudy
	 * @generated
	 */
	EClass getExperimentalStudy();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.ExperimentalStudy#getExperiments <em>Experiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiments</em>'.
	 * @see experimentOntology.ExperimentalStudy#getExperiments()
	 * @see #getExperimentalStudy()
	 * @generated
	 */
	EReference getExperimentalStudy_Experiments();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.ExperimentalStudy#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see experimentOntology.ExperimentalStudy#getDescription()
	 * @see #getExperimentalStudy()
	 * @generated
	 */
	EReference getExperimentalStudy_Description();

	/**
	 * Returns the meta object for class '{@link experimentOntology.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment</em>'.
	 * @see experimentOntology.Experiment
	 * @generated
	 */
	EClass getExperiment();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.Experiment#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see experimentOntology.Experiment#getPlan()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Plan();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.Experiment#getExecutionPlan <em>Execution Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Plan</em>'.
	 * @see experimentOntology.Experiment#getExecutionPlan()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_ExecutionPlan();

	/**
	 * Returns the meta object for class '{@link experimentOntology.Replication <em>Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replication</em>'.
	 * @see experimentOntology.Replication
	 * @generated
	 */
	EClass getReplication();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.Replication#getOriginal <em>Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Original</em>'.
	 * @see experimentOntology.Replication#getOriginal()
	 * @see #getReplication()
	 * @generated
	 */
	EReference getReplication_Original();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExperimentOntologyFactory getExperimentOntologyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link experimentOntology.impl.ExperimentalStudyImpl <em>Experimental Study</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.impl.ExperimentalStudyImpl
		 * @see experimentOntology.impl.ExperimentOntologyPackageImpl#getExperimentalStudy()
		 * @generated
		 */
		EClass EXPERIMENTAL_STUDY = eINSTANCE.getExperimentalStudy();

		/**
		 * The meta object literal for the '<em><b>Experiments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_STUDY__EXPERIMENTS = eINSTANCE.getExperimentalStudy_Experiments();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENTAL_STUDY__DESCRIPTION = eINSTANCE.getExperimentalStudy_Description();

		/**
		 * The meta object literal for the '{@link experimentOntology.impl.ExperimentImpl <em>Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.impl.ExperimentImpl
		 * @see experimentOntology.impl.ExperimentOntologyPackageImpl#getExperiment()
		 * @generated
		 */
		EClass EXPERIMENT = eINSTANCE.getExperiment();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__PLAN = eINSTANCE.getExperiment_Plan();

		/**
		 * The meta object literal for the '<em><b>Execution Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__EXECUTION_PLAN = eINSTANCE.getExperiment_ExecutionPlan();

		/**
		 * The meta object literal for the '{@link experimentOntology.impl.ReplicationImpl <em>Replication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.impl.ReplicationImpl
		 * @see experimentOntology.impl.ExperimentOntologyPackageImpl#getReplication()
		 * @generated
		 */
		EClass REPLICATION = eINSTANCE.getReplication();

		/**
		 * The meta object literal for the '<em><b>Original</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION__ORIGINAL = eINSTANCE.getReplication_Original();

	}

} //ExperimentOntologyPackage
