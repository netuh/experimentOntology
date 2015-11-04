/**
 */
package codingExperimentOntology.variables.impl;

import codingExperimentOntology.variables.*;

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
public class NewPackage1FactoryImpl extends EFactoryImpl implements NewPackage1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NewPackage1Factory init() {
		try {
			NewPackage1Factory theNewPackage1Factory = (NewPackage1Factory)EPackage.Registry.INSTANCE.getEFactory(NewPackage1Package.eNS_URI);
			if (theNewPackage1Factory != null) {
				return theNewPackage1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NewPackage1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage1FactoryImpl() {
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
			case NewPackage1Package.TIME_BOUND_VARIABLE: return createTimeBoundVariable();
			case NewPackage1Package.RESOURCE_BASED_VARIABLE: return createResourceBasedVariable();
			case NewPackage1Package.AWNSER_BASED_VARIABLE: return createAwnserBasedVariable();
			case NewPackage1Package.ARTIFACT_INDEPENDENT_VARIABLE: return createArtifactIndependentVariable();
			case NewPackage1Package.ENVIROMENT_INDEPENDENT_VARIABLE: return createEnviromentIndependentVariable();
			case NewPackage1Package.OTHER_CODING_VARIABLE: return createOtherCodingVariable();
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
			case NewPackage1Package.COMMON_VARIABLE_TYPES:
				return createCommonVariableTypesFromString(eDataType, initialValue);
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
			case NewPackage1Package.COMMON_VARIABLE_TYPES:
				return convertCommonVariableTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBoundVariable createTimeBoundVariable() {
		TimeBoundVariableImpl timeBoundVariable = new TimeBoundVariableImpl();
		return timeBoundVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBasedVariable createResourceBasedVariable() {
		ResourceBasedVariableImpl resourceBasedVariable = new ResourceBasedVariableImpl();
		return resourceBasedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwnserBasedVariable createAwnserBasedVariable() {
		AwnserBasedVariableImpl awnserBasedVariable = new AwnserBasedVariableImpl();
		return awnserBasedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactIndependentVariable createArtifactIndependentVariable() {
		ArtifactIndependentVariableImpl artifactIndependentVariable = new ArtifactIndependentVariableImpl();
		return artifactIndependentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnviromentIndependentVariable createEnviromentIndependentVariable() {
		EnviromentIndependentVariableImpl enviromentIndependentVariable = new EnviromentIndependentVariableImpl();
		return enviromentIndependentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherCodingVariable createOtherCodingVariable() {
		OtherCodingVariableImpl otherCodingVariable = new OtherCodingVariableImpl();
		return otherCodingVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonVariableTypes createCommonVariableTypesFromString(EDataType eDataType, String initialValue) {
		CommonVariableTypes result = CommonVariableTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommonVariableTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage1Package getNewPackage1Package() {
		return (NewPackage1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NewPackage1Package getPackage() {
		return NewPackage1Package.eINSTANCE;
	}

} //NewPackage1FactoryImpl
