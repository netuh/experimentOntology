/**
 */
package experimentOntology.planning.designOfExperiment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentFactory
 * @model kind="package"
 * @generated
 */
public interface DesignOfExperimentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "designOfExperiment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/designOfExperiment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "designOfExperiment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DesignOfExperimentPackage eINSTANCE = experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl.init();

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.DesignTypeImpl <em>Design Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignTypeImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getDesignType()
	 * @generated
	 */
	int DESIGN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_TYPE__DISCIPLINE = 0;

	/**
	 * The number of structural features of the '<em>Design Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Design Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.DesignDisciplineImpl <em>Design Discipline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignDisciplineImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getDesignDiscipline()
	 * @generated
	 */
	int DESIGN_DISCIPLINE = 1;

	/**
	 * The number of structural features of the '<em>Design Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DISCIPLINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Design Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_DISCIPLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.RandomizedDisciplineImpl <em>Randomized Discipline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.RandomizedDisciplineImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getRandomizedDiscipline()
	 * @generated
	 */
	int RANDOMIZED_DISCIPLINE = 2;

	/**
	 * The number of structural features of the '<em>Randomized Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_DISCIPLINE_FEATURE_COUNT = DESIGN_DISCIPLINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Randomized Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZED_DISCIPLINE_OPERATION_COUNT = DESIGN_DISCIPLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.BlockDesignDisciplineImpl <em>Block Design Discipline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.BlockDesignDisciplineImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getBlockDesignDiscipline()
	 * @generated
	 */
	int BLOCK_DESIGN_DISCIPLINE = 3;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DESIGN_DISCIPLINE__BLOCK = DESIGN_DISCIPLINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Design Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DESIGN_DISCIPLINE_FEATURE_COUNT = DESIGN_DISCIPLINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Design Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DESIGN_DISCIPLINE_OPERATION_COUNT = DESIGN_DISCIPLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.BalancedDesignDisciplineImpl <em>Balanced Design Discipline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.BalancedDesignDisciplineImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getBalancedDesignDiscipline()
	 * @generated
	 */
	int BALANCED_DESIGN_DISCIPLINE = 4;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALANCED_DESIGN_DISCIPLINE__BLOCK = BLOCK_DESIGN_DISCIPLINE__BLOCK;

	/**
	 * The number of structural features of the '<em>Balanced Design Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALANCED_DESIGN_DISCIPLINE_FEATURE_COUNT = BLOCK_DESIGN_DISCIPLINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Balanced Design Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALANCED_DESIGN_DISCIPLINE_OPERATION_COUNT = BLOCK_DESIGN_DISCIPLINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.BlockedCharacteristicImpl <em>Blocked Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.BlockedCharacteristicImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getBlockedCharacteristic()
	 * @generated
	 */
	int BLOCKED_CHARACTERISTIC = 5;

	/**
	 * The feature id for the '<em><b>Threat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_CHARACTERISTIC__THREAT = 0;

	/**
	 * The number of structural features of the '<em>Blocked Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_CHARACTERISTIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Blocked Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKED_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.OneFactorDesignImpl <em>One Factor Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.OneFactorDesignImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getOneFactorDesign()
	 * @generated
	 */
	int ONE_FACTOR_DESIGN = 6;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_FACTOR_DESIGN__DISCIPLINE = DESIGN_TYPE__DISCIPLINE;

	/**
	 * The number of structural features of the '<em>One Factor Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_FACTOR_DESIGN_FEATURE_COUNT = DESIGN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>One Factor Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_FACTOR_DESIGN_OPERATION_COUNT = DESIGN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.TwoTreatmentDesignImpl <em>Two Treatment Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.TwoTreatmentDesignImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getTwoTreatmentDesign()
	 * @generated
	 */
	int TWO_TREATMENT_DESIGN = 7;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_TREATMENT_DESIGN__DISCIPLINE = ONE_FACTOR_DESIGN__DISCIPLINE;

	/**
	 * The number of structural features of the '<em>Two Treatment Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_TREATMENT_DESIGN_FEATURE_COUNT = ONE_FACTOR_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Two Treatment Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_TREATMENT_DESIGN_OPERATION_COUNT = ONE_FACTOR_DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.MultTreatmentDesignImpl <em>Mult Treatment Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.MultTreatmentDesignImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getMultTreatmentDesign()
	 * @generated
	 */
	int MULT_TREATMENT_DESIGN = 8;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_TREATMENT_DESIGN__DISCIPLINE = ONE_FACTOR_DESIGN__DISCIPLINE;

	/**
	 * The number of structural features of the '<em>Mult Treatment Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_TREATMENT_DESIGN_FEATURE_COUNT = ONE_FACTOR_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mult Treatment Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_TREATMENT_DESIGN_OPERATION_COUNT = ONE_FACTOR_DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.TwoFactorDesignImpl <em>Two Factor Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.TwoFactorDesignImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getTwoFactorDesign()
	 * @generated
	 */
	int TWO_FACTOR_DESIGN = 9;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_FACTOR_DESIGN__DISCIPLINE = DESIGN_TYPE__DISCIPLINE;

	/**
	 * The number of structural features of the '<em>Two Factor Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_FACTOR_DESIGN_FEATURE_COUNT = DESIGN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Two Factor Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_FACTOR_DESIGN_OPERATION_COUNT = DESIGN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.SquareDesignImpl <em>Square Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.SquareDesignImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getSquareDesign()
	 * @generated
	 */
	int SQUARE_DESIGN = 10;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_DESIGN__DISCIPLINE = TWO_FACTOR_DESIGN__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_DESIGN__COLUMN = TWO_FACTOR_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_DESIGN__LINE = TWO_FACTOR_DESIGN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Square Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_DESIGN_FEATURE_COUNT = TWO_FACTOR_DESIGN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Square Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_DESIGN_OPERATION_COUNT = TWO_FACTOR_DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.NestedFactorDesignImpl <em>Nested Factor Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.NestedFactorDesignImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getNestedFactorDesign()
	 * @generated
	 */
	int NESTED_FACTOR_DESIGN = 11;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_FACTOR_DESIGN__DISCIPLINE = TWO_FACTOR_DESIGN__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Stage One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_FACTOR_DESIGN__STAGE_ONE = TWO_FACTOR_DESIGN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stage Two</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_FACTOR_DESIGN__STAGE_TWO = TWO_FACTOR_DESIGN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nested Factor Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_FACTOR_DESIGN_FEATURE_COUNT = TWO_FACTOR_DESIGN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Nested Factor Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_FACTOR_DESIGN_OPERATION_COUNT = TWO_FACTOR_DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.TriFactorDesignImpl <em>Tri Factor Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.TriFactorDesignImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getTriFactorDesign()
	 * @generated
	 */
	int TRI_FACTOR_DESIGN = 12;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_FACTOR_DESIGN__DISCIPLINE = DESIGN_TYPE__DISCIPLINE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_FACTOR_DESIGN__TYPE = DESIGN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tri Factor Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_FACTOR_DESIGN_FEATURE_COUNT = DESIGN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tri Factor Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRI_FACTOR_DESIGN_OPERATION_COUNT = DESIGN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.impl.GenericDesignImpl <em>Generic Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.impl.GenericDesignImpl
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getGenericDesign()
	 * @generated
	 */
	int GENERIC_DESIGN = 13;

	/**
	 * The feature id for the '<em><b>Discipline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DESIGN__DISCIPLINE = DESIGN_TYPE__DISCIPLINE;

	/**
	 * The number of structural features of the '<em>Generic Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DESIGN_FEATURE_COUNT = DESIGN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DESIGN_OPERATION_COUNT = DESIGN_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.planning.designOfExperiment.TriFactorTypes <em>Tri Factor Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.planning.designOfExperiment.TriFactorTypes
	 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getTriFactorTypes()
	 * @generated
	 */
	int TRI_FACTOR_TYPES = 14;


	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.DesignType <em>Design Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Type</em>'.
	 * @see experimentOntology.planning.designOfExperiment.DesignType
	 * @generated
	 */
	EClass getDesignType();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.planning.designOfExperiment.DesignType#getDiscipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discipline</em>'.
	 * @see experimentOntology.planning.designOfExperiment.DesignType#getDiscipline()
	 * @see #getDesignType()
	 * @generated
	 */
	EReference getDesignType_Discipline();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.DesignDiscipline <em>Design Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Discipline</em>'.
	 * @see experimentOntology.planning.designOfExperiment.DesignDiscipline
	 * @generated
	 */
	EClass getDesignDiscipline();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.RandomizedDiscipline <em>Randomized Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Randomized Discipline</em>'.
	 * @see experimentOntology.planning.designOfExperiment.RandomizedDiscipline
	 * @generated
	 */
	EClass getRandomizedDiscipline();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.BlockDesignDiscipline <em>Block Design Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Design Discipline</em>'.
	 * @see experimentOntology.planning.designOfExperiment.BlockDesignDiscipline
	 * @generated
	 */
	EClass getBlockDesignDiscipline();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.planning.designOfExperiment.BlockDesignDiscipline#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see experimentOntology.planning.designOfExperiment.BlockDesignDiscipline#getBlock()
	 * @see #getBlockDesignDiscipline()
	 * @generated
	 */
	EReference getBlockDesignDiscipline_Block();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.BalancedDesignDiscipline <em>Balanced Design Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balanced Design Discipline</em>'.
	 * @see experimentOntology.planning.designOfExperiment.BalancedDesignDiscipline
	 * @generated
	 */
	EClass getBalancedDesignDiscipline();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.BlockedCharacteristic <em>Blocked Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blocked Characteristic</em>'.
	 * @see experimentOntology.planning.designOfExperiment.BlockedCharacteristic
	 * @generated
	 */
	EClass getBlockedCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link experimentOntology.planning.designOfExperiment.BlockedCharacteristic#getThreat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threat</em>'.
	 * @see experimentOntology.planning.designOfExperiment.BlockedCharacteristic#getThreat()
	 * @see #getBlockedCharacteristic()
	 * @generated
	 */
	EReference getBlockedCharacteristic_Threat();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.OneFactorDesign <em>One Factor Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Factor Design</em>'.
	 * @see experimentOntology.planning.designOfExperiment.OneFactorDesign
	 * @generated
	 */
	EClass getOneFactorDesign();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.TwoTreatmentDesign <em>Two Treatment Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Treatment Design</em>'.
	 * @see experimentOntology.planning.designOfExperiment.TwoTreatmentDesign
	 * @generated
	 */
	EClass getTwoTreatmentDesign();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.MultTreatmentDesign <em>Mult Treatment Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mult Treatment Design</em>'.
	 * @see experimentOntology.planning.designOfExperiment.MultTreatmentDesign
	 * @generated
	 */
	EClass getMultTreatmentDesign();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.TwoFactorDesign <em>Two Factor Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Factor Design</em>'.
	 * @see experimentOntology.planning.designOfExperiment.TwoFactorDesign
	 * @generated
	 */
	EClass getTwoFactorDesign();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.SquareDesign <em>Square Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square Design</em>'.
	 * @see experimentOntology.planning.designOfExperiment.SquareDesign
	 * @generated
	 */
	EClass getSquareDesign();

	/**
	 * Returns the meta object for the reference '{@link experimentOntology.planning.designOfExperiment.SquareDesign#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see experimentOntology.planning.designOfExperiment.SquareDesign#getColumn()
	 * @see #getSquareDesign()
	 * @generated
	 */
	EReference getSquareDesign_Column();

	/**
	 * Returns the meta object for the reference '{@link experimentOntology.planning.designOfExperiment.SquareDesign#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Line</em>'.
	 * @see experimentOntology.planning.designOfExperiment.SquareDesign#getLine()
	 * @see #getSquareDesign()
	 * @generated
	 */
	EReference getSquareDesign_Line();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.NestedFactorDesign <em>Nested Factor Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Factor Design</em>'.
	 * @see experimentOntology.planning.designOfExperiment.NestedFactorDesign
	 * @generated
	 */
	EClass getNestedFactorDesign();

	/**
	 * Returns the meta object for the reference '{@link experimentOntology.planning.designOfExperiment.NestedFactorDesign#getStageOne <em>Stage One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stage One</em>'.
	 * @see experimentOntology.planning.designOfExperiment.NestedFactorDesign#getStageOne()
	 * @see #getNestedFactorDesign()
	 * @generated
	 */
	EReference getNestedFactorDesign_StageOne();

	/**
	 * Returns the meta object for the reference '{@link experimentOntology.planning.designOfExperiment.NestedFactorDesign#getStageTwo <em>Stage Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stage Two</em>'.
	 * @see experimentOntology.planning.designOfExperiment.NestedFactorDesign#getStageTwo()
	 * @see #getNestedFactorDesign()
	 * @generated
	 */
	EReference getNestedFactorDesign_StageTwo();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.TriFactorDesign <em>Tri Factor Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tri Factor Design</em>'.
	 * @see experimentOntology.planning.designOfExperiment.TriFactorDesign
	 * @generated
	 */
	EClass getTriFactorDesign();

	/**
	 * Returns the meta object for the attribute '{@link experimentOntology.planning.designOfExperiment.TriFactorDesign#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see experimentOntology.planning.designOfExperiment.TriFactorDesign#getType()
	 * @see #getTriFactorDesign()
	 * @generated
	 */
	EAttribute getTriFactorDesign_Type();

	/**
	 * Returns the meta object for class '{@link experimentOntology.planning.designOfExperiment.GenericDesign <em>Generic Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Design</em>'.
	 * @see experimentOntology.planning.designOfExperiment.GenericDesign
	 * @generated
	 */
	EClass getGenericDesign();

	/**
	 * Returns the meta object for enum '{@link experimentOntology.planning.designOfExperiment.TriFactorTypes <em>Tri Factor Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tri Factor Types</em>'.
	 * @see experimentOntology.planning.designOfExperiment.TriFactorTypes
	 * @generated
	 */
	EEnum getTriFactorTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DesignOfExperimentFactory getDesignOfExperimentFactory();

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
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.DesignTypeImpl <em>Design Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignTypeImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getDesignType()
		 * @generated
		 */
		EClass DESIGN_TYPE = eINSTANCE.getDesignType();

		/**
		 * The meta object literal for the '<em><b>Discipline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_TYPE__DISCIPLINE = eINSTANCE.getDesignType_Discipline();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.DesignDisciplineImpl <em>Design Discipline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignDisciplineImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getDesignDiscipline()
		 * @generated
		 */
		EClass DESIGN_DISCIPLINE = eINSTANCE.getDesignDiscipline();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.RandomizedDisciplineImpl <em>Randomized Discipline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.RandomizedDisciplineImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getRandomizedDiscipline()
		 * @generated
		 */
		EClass RANDOMIZED_DISCIPLINE = eINSTANCE.getRandomizedDiscipline();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.BlockDesignDisciplineImpl <em>Block Design Discipline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.BlockDesignDisciplineImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getBlockDesignDiscipline()
		 * @generated
		 */
		EClass BLOCK_DESIGN_DISCIPLINE = eINSTANCE.getBlockDesignDiscipline();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_DESIGN_DISCIPLINE__BLOCK = eINSTANCE.getBlockDesignDiscipline_Block();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.BalancedDesignDisciplineImpl <em>Balanced Design Discipline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.BalancedDesignDisciplineImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getBalancedDesignDiscipline()
		 * @generated
		 */
		EClass BALANCED_DESIGN_DISCIPLINE = eINSTANCE.getBalancedDesignDiscipline();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.BlockedCharacteristicImpl <em>Blocked Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.BlockedCharacteristicImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getBlockedCharacteristic()
		 * @generated
		 */
		EClass BLOCKED_CHARACTERISTIC = eINSTANCE.getBlockedCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Threat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKED_CHARACTERISTIC__THREAT = eINSTANCE.getBlockedCharacteristic_Threat();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.OneFactorDesignImpl <em>One Factor Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.OneFactorDesignImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getOneFactorDesign()
		 * @generated
		 */
		EClass ONE_FACTOR_DESIGN = eINSTANCE.getOneFactorDesign();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.TwoTreatmentDesignImpl <em>Two Treatment Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.TwoTreatmentDesignImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getTwoTreatmentDesign()
		 * @generated
		 */
		EClass TWO_TREATMENT_DESIGN = eINSTANCE.getTwoTreatmentDesign();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.MultTreatmentDesignImpl <em>Mult Treatment Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.MultTreatmentDesignImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getMultTreatmentDesign()
		 * @generated
		 */
		EClass MULT_TREATMENT_DESIGN = eINSTANCE.getMultTreatmentDesign();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.TwoFactorDesignImpl <em>Two Factor Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.TwoFactorDesignImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getTwoFactorDesign()
		 * @generated
		 */
		EClass TWO_FACTOR_DESIGN = eINSTANCE.getTwoFactorDesign();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.SquareDesignImpl <em>Square Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.SquareDesignImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getSquareDesign()
		 * @generated
		 */
		EClass SQUARE_DESIGN = eINSTANCE.getSquareDesign();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE_DESIGN__COLUMN = eINSTANCE.getSquareDesign_Column();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE_DESIGN__LINE = eINSTANCE.getSquareDesign_Line();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.NestedFactorDesignImpl <em>Nested Factor Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.NestedFactorDesignImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getNestedFactorDesign()
		 * @generated
		 */
		EClass NESTED_FACTOR_DESIGN = eINSTANCE.getNestedFactorDesign();

		/**
		 * The meta object literal for the '<em><b>Stage One</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_FACTOR_DESIGN__STAGE_ONE = eINSTANCE.getNestedFactorDesign_StageOne();

		/**
		 * The meta object literal for the '<em><b>Stage Two</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_FACTOR_DESIGN__STAGE_TWO = eINSTANCE.getNestedFactorDesign_StageTwo();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.TriFactorDesignImpl <em>Tri Factor Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.TriFactorDesignImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getTriFactorDesign()
		 * @generated
		 */
		EClass TRI_FACTOR_DESIGN = eINSTANCE.getTriFactorDesign();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRI_FACTOR_DESIGN__TYPE = eINSTANCE.getTriFactorDesign_Type();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.impl.GenericDesignImpl <em>Generic Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.impl.GenericDesignImpl
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getGenericDesign()
		 * @generated
		 */
		EClass GENERIC_DESIGN = eINSTANCE.getGenericDesign();

		/**
		 * The meta object literal for the '{@link experimentOntology.planning.designOfExperiment.TriFactorTypes <em>Tri Factor Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.planning.designOfExperiment.TriFactorTypes
		 * @see experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl#getTriFactorTypes()
		 * @generated
		 */
		EEnum TRI_FACTOR_TYPES = eINSTANCE.getTriFactorTypes();

	}

} //DesignOfExperimentPackage
