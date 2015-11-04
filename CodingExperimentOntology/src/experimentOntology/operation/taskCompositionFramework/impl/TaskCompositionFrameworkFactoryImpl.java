/**
 */
package experimentOntology.operation.taskCompositionFramework.impl;

import experimentOntology.operation.taskCompositionFramework.*;

import org.eclipse.emf.ecore.EClass;
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
public class TaskCompositionFrameworkFactoryImpl extends EFactoryImpl implements TaskCompositionFrameworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskCompositionFrameworkFactory init() {
		try {
			TaskCompositionFrameworkFactory theTaskCompositionFrameworkFactory = (TaskCompositionFrameworkFactory)EPackage.Registry.INSTANCE.getEFactory(TaskCompositionFrameworkPackage.eNS_URI);
			if (theTaskCompositionFrameworkFactory != null) {
				return theTaskCompositionFrameworkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskCompositionFrameworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCompositionFrameworkFactoryImpl() {
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
			case TaskCompositionFrameworkPackage.SEQUENCE: return createSequence();
			case TaskCompositionFrameworkPackage.RANDOM: return createRandom();
			case TaskCompositionFrameworkPackage.IF: return createIf();
			case TaskCompositionFrameworkPackage.ELSE_IF: return createElseIf();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Random createRandom() {
		RandomImpl random = new RandomImpl();
		return random;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseIf createElseIf() {
		ElseIfImpl elseIf = new ElseIfImpl();
		return elseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskCompositionFrameworkPackage getTaskCompositionFrameworkPackage() {
		return (TaskCompositionFrameworkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskCompositionFrameworkPackage getPackage() {
		return TaskCompositionFrameworkPackage.eINSTANCE;
	}

} //TaskCompositionFrameworkFactoryImpl
