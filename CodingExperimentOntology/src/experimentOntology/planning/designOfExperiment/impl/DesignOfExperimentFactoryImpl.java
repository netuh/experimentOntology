/**
 */
package experimentOntology.planning.designOfExperiment.impl;

import experimentOntology.planning.designOfExperiment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignOfExperimentFactoryImpl extends EFactoryImpl implements DesignOfExperimentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DesignOfExperimentFactory init() {
		try {
			DesignOfExperimentFactory theDesignOfExperimentFactory = (DesignOfExperimentFactory)EPackage.Registry.INSTANCE.getEFactory(DesignOfExperimentPackage.eNS_URI);
			if (theDesignOfExperimentFactory != null) {
				return theDesignOfExperimentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DesignOfExperimentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignOfExperimentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DesignOfExperimentPackage.RANDOMIZED_DISCIPLINE: return createRandomizedDiscipline();
			case DesignOfExperimentPackage.BLOCK_DESIGN_DISCIPLINE: return createBlockDesignDiscipline();
			case DesignOfExperimentPackage.BALANCED_DESIGN_DISCIPLINE: return createBalancedDesignDiscipline();
			case DesignOfExperimentPackage.BLOCKED_CHARACTERISTIC: return createBlockedCharacteristic();
			case DesignOfExperimentPackage.TWO_TREATMENT_DESIGN: return createTwoTreatmentDesign();
			case DesignOfExperimentPackage.MULT_TREATMENT_DESIGN: return createMultTreatmentDesign();
			case DesignOfExperimentPackage.SQUARE_DESIGN: return createSquareDesign();
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN: return createNestedFactorDesign();
			case DesignOfExperimentPackage.TRI_FACTOR_DESIGN: return createTriFactorDesign();
			case DesignOfExperimentPackage.GENERIC_DESIGN: return createGenericDesign();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DesignOfExperimentPackage.TRI_FACTOR_TYPES:
				return createTriFactorTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DesignOfExperimentPackage.TRI_FACTOR_TYPES:
				return convertTriFactorTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomizedDiscipline createRandomizedDiscipline() {
		RandomizedDisciplineImpl randomizedDiscipline = new RandomizedDisciplineImpl();
		return randomizedDiscipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockDesignDiscipline createBlockDesignDiscipline() {
		BlockDesignDisciplineImpl blockDesignDiscipline = new BlockDesignDisciplineImpl();
		return blockDesignDiscipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BalancedDesignDiscipline createBalancedDesignDiscipline() {
		BalancedDesignDisciplineImpl balancedDesignDiscipline = new BalancedDesignDisciplineImpl();
		return balancedDesignDiscipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockedCharacteristic createBlockedCharacteristic() {
		BlockedCharacteristicImpl blockedCharacteristic = new BlockedCharacteristicImpl();
		return blockedCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoTreatmentDesign createTwoTreatmentDesign() {
		TwoTreatmentDesignImpl twoTreatmentDesign = new TwoTreatmentDesignImpl();
		return twoTreatmentDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultTreatmentDesign createMultTreatmentDesign() {
		MultTreatmentDesignImpl multTreatmentDesign = new MultTreatmentDesignImpl();
		return multTreatmentDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SquareDesign createSquareDesign() {
		SquareDesignImpl squareDesign = new SquareDesignImpl();
		return squareDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedFactorDesign createNestedFactorDesign() {
		NestedFactorDesignImpl nestedFactorDesign = new NestedFactorDesignImpl();
		return nestedFactorDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriFactorDesign createTriFactorDesign() {
		TriFactorDesignImpl triFactorDesign = new TriFactorDesignImpl();
		return triFactorDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDesign createGenericDesign() {
		GenericDesignImpl genericDesign = new GenericDesignImpl();
		return genericDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriFactorTypes createTriFactorTypesFromString(EDataType eDataType, String initialValue) {
		TriFactorTypes result = TriFactorTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriFactorTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignOfExperimentPackage getDesignOfExperimentPackage() {
		return (DesignOfExperimentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DesignOfExperimentPackage getPackage() {
		return DesignOfExperimentPackage.eINSTANCE;
	}

} //DesignOfExperimentFactoryImpl
