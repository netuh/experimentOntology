/**
 */
package codingExperimentOntology.tasks.impl;

import codingExperimentOntology.tasks.*;

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
public class NewPackage2FactoryImpl extends EFactoryImpl implements NewPackage2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NewPackage2Factory init() {
		try {
			NewPackage2Factory theNewPackage2Factory = (NewPackage2Factory)EPackage.Registry.INSTANCE.getEFactory(NewPackage2Package.eNS_URI);
			if (theNewPackage2Factory != null) {
				return theNewPackage2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NewPackage2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage2FactoryImpl() {
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
			case NewPackage2Package.GENERIC_CODING_TASK: return createGenericCodingTask();
			case NewPackage2Package.TRAINING_CLASS: return createTrainingClass();
			case NewPackage2Package.PILOT_TASK: return createPilotTask();
			case NewPackage2Package.EXPERIMENTAL_CODING_TASK: return createExperimentalCodingTask();
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
			case NewPackage2Package.CODING_TASK_TYPES:
				return createCodingTaskTypesFromString(eDataType, initialValue);
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
			case NewPackage2Package.CODING_TASK_TYPES:
				return convertCodingTaskTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericCodingTask createGenericCodingTask() {
		GenericCodingTaskImpl genericCodingTask = new GenericCodingTaskImpl();
		return genericCodingTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingClass createTrainingClass() {
		TrainingClassImpl trainingClass = new TrainingClassImpl();
		return trainingClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PilotTask createPilotTask() {
		PilotTaskImpl pilotTask = new PilotTaskImpl();
		return pilotTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalCodingTask createExperimentalCodingTask() {
		ExperimentalCodingTaskImpl experimentalCodingTask = new ExperimentalCodingTaskImpl();
		return experimentalCodingTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingTaskTypes createCodingTaskTypesFromString(EDataType eDataType, String initialValue) {
		CodingTaskTypes result = CodingTaskTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodingTaskTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage2Package getNewPackage2Package() {
		return (NewPackage2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NewPackage2Package getPackage() {
		return NewPackage2Package.eINSTANCE;
	}

} //NewPackage2FactoryImpl
